package pe.gob.sunat.megaproceso3.macroproceso.proceso.ejb.mdb;


import java.util.logging.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.ejb.MessageDrivenBean;
import javax.ejb.MessageDrivenContext;
import javax.inject.Inject;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

@MessageDriven(activationConfig = {
		@ActivationConfigProperty(propertyName = "destinationType", propertyValue = "javax.jms.Queue") }, mappedName = "jms/crgaTestQueue", messageListenerInterface = MessageListener.class)
public class BeanMDB implements MessageListener, MessageDrivenBean {

	private static final long serialVersionUID = 5230066640840988428L;

	private transient Logger logger = Logger.getLogger(this.getClass().getName());

	@Inject
	private MessageDrivenContext mdc;

	// Constructor ...
	public BeanMDB() {
	}

	/**
	 * setMessageDrivenContext
	 * 
	 * @param mdbParam
	 */
	public void setMessageDrivenContext(MessageDrivenContext mdbParam) {
		this.mdc = mdbParam;
	}

	/**
	 * ejbRemove
	 */
	public void ejbRemove() {
	}

	/**
	 * ejbRemove
	 */
	public void ejbCreate() {
	}

	/**
	 * onMessage
	 * 
	 * @param messageParam
	 */
	public void onMessage(Message messageParam) {
		this.logger.info("************ DENTRO DE: [onMessage] [TRAMA] ************");

		try {
			if (messageParam instanceof TextMessage) {

				TextMessage txtMessage = (TextMessage) messageParam;
				String mensaje = txtMessage.getText();
				System.out.println("TRAMA:  " + mensaje);

				String[] arrayTrama = mensaje.split("\\|");

				System.out.println("TAMANO: " + arrayTrama.length);

				String codigo = arrayTrama[0];
				String nombres = arrayTrama[1];
				String apellidos = arrayTrama[2];
				String dni = arrayTrama[3];
				String edad = arrayTrama[4];
				String telefono = arrayTrama[5];

				System.out.println(" ");
				System.out.println("CODIGO:    " + codigo);
				System.out.println("NOMBRES:   " + nombres);
				System.out.println("APELLIDOS: " + apellidos);
				System.out.println("DNI:       " + dni);
				System.out.println("EDAD:      " + edad);
				System.out.println("TELEFONO:  " + telefono);
				System.out.println(" ");
			}
		} catch (JMSException e) {
			this.logger.info("ERROR [JMSException]: "+ e);
			e.printStackTrace();
			this.mdc.setRollbackOnly();
		} catch (Exception e) {
			this.logger.info("ERROR [Exception]: "+ e);
			e.printStackTrace();
		} catch (Throwable e) {
			this.logger.info("ERROR [Throwable]: "+ e);
			e.printStackTrace();
		}
	}
}

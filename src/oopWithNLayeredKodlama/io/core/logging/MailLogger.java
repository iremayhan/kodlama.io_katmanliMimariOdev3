package oopWithNLayeredKodlama.io.core.logging;

public class MailLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println("Mail ile gönderildi: " + data);
	}

}

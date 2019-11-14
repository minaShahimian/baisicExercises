package traits3.exercise04;

public class Messenger {
    private String encryptor;
    private String decryptor;

    public Messenger(String encryptor, String decryptor) {
        this.encryptor = encryptor;
        this.decryptor = decryptor;
    }

    public String send(String encryptedMessage) {


        return encryptedMessage;
    }

    public String receive(String decryptedMessage) {

        return decryptedMessage;
    }
}

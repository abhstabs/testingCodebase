package Ai.privado.test.aws;

import com.amazonaws.services.kms.AWSKMS;
import com.amazonaws.services.kms.AWSKMSClientBuilder;
import com.amazonaws.services.kms.model.DecryptRequest;
import com.amazonaws.services.kms.model.DecryptResult;
import com.amazonaws.services.kms.model.EncryptRequest;
import com.amazonaws.services.kms.model.EncryptResult;

public class KMS {
    public static void main(String[] args) {
        // Build an AWS KMS client
        AWSKMS kmsClient = AWSKMSClientBuilder.defaultClient();

        // Personal data to be encrypted
        byte[] personalData = "sensitive_data".getBytes();

        // Encrypt the personal data using KMS
        EncryptRequest encryptRequest = new EncryptRequest().withKeyId("alias/my-key").withPlaintext(ByteBuffer.wrap(personalData));
        EncryptResult encryptResult = kmsClient.encrypt(encryptRequest);
        ByteBuffer ciphertext = encryptResult.getCiphertextBlob();

        // Decrypt the encrypted personal data using KMS
        DecryptRequest decryptRequest = new DecryptRequest().withCiphertextBlob(ciphertext);
        DecryptResult decryptResult = kmsClient.decrypt(decryptRequest);
        byte[] decryptedPersonalData = decryptResult.getPlaintext().array();
    }
}


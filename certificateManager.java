import com.amazonaws.services.certificatemanager.AmazonCertificateManager;
import com.amazonaws.services.certificatemanager.AmazonCertificateManagerClientBuilder;
import com.amazonaws.services.certificatemanager.model.RequestCertificateRequest;
import com.amazonaws.services.certificatemanager.model.RequestCertificateResult;
import com.amazonaws.services.certificatemanager.model.DescribeCertificateRequest;
import com.amazonaws.services.certificatemanager.model.DescribeCertificateResult;

public class CertificateManagerExample {
    public static void main(String[] args) {
        // Build an Amazon Certificate Manager client
        AmazonCertificateManager certificateManagerClient = AmazonCertificateManagerClientBuilder.defaultClient();

        // Personal data to be used in a certificate request
        String domainName = "example.com";
        String subjectAlternativeName = "www.example.com";

        // Request a certificate
        RequestCertificateRequest requestCertificateRequest = new RequestCertificateRequest()
                .withDomainName(domainName)
                .withSubjectAlternativeNames(subjectAlternativeName);
        RequestCertificateResult requestCertificateResult = certificateManagerClient.requestCertificate(requestCertificateRequest);
        String certificateArn = requestCertificateResult.getCertificateArn();

        // Describe the certificate
        DescribeCertificateRequest describeCertificateRequest = new DescribeCertificateRequest()
                .withCertificateArn(certificateArn);
        DescribeCertificateResult describeCertificateResult = certificateManagerClient.describeCertificate(describeCertificateRequest);
    }
}


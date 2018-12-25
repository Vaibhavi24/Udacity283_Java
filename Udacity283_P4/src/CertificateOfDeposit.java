import java.util.Date;

public class CertificateOfDeposit extends BankAccount {

    private Date expiry;

    public Date getExpiry()
    {
        return expiry;
    }

    public void setExpiry(Date expiry)
    {
        this.expiry = expiry;
    }
}

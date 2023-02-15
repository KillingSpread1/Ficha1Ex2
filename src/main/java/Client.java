import java.util.ArrayList;

/**
 * This class represents a bank client.
 */
public class Client {
    private String name;
    private int age;
    private int nChildren;
    private double debt;
    private ArrayList<Account> accounts = new ArrayList<>();
    public Client(String name, int age, int nChildren, double debt) {
        this.name = name;
        this.age = age;
        this.nChildren = nChildren;
        this.debt = debt;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    /**
     * Gets the name of the client
     *
     * @return the name of the client
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the name of the client
     *
     *
     * @param name the name of the client
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets the age of the client
     * @return the age of the client
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the client
     * @param age age of the client
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the number of Children of the client
     * @return the number of children of the client
     */
    public int getnChildren() {
        return nChildren;
    }

    /**
     * Gets the nChildren of the client
     * @param nChildren nChildren of the client
     */
    public void setnChildren(int nChildren) {
        this.nChildren = nChildren;
    }

    public double getDebt() {
        return debt;
    }

    public void setDebt(double debt) {
        this.debt = debt;
    }

    public boolean addAccount(Account account) {
        if (!accounts.contains(account)){
            accounts.add(account);
        } else {
            throw new ArrayStoreException("This account is already associated");
        }
        return true;
    }
}

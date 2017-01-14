package CoolTasks_1.Databases;


public class Company {
    private String nameCompany;
    private int numberWorker;

    public Company(String nameCompany, int numberWorker) {
        this.nameCompany = nameCompany;
        this.numberWorker = numberWorker;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public int getNumberWorker() {
        return numberWorker;
    }

    public void setNumberWorker(int numberWorker) {
        this.numberWorker = numberWorker;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Company)) return false;

        Company company = (Company) o;

        if (getNumberWorker() != company.getNumberWorker()) return false;
        return getNameCompany() != null ? getNameCompany().equals(company.getNameCompany()) : company.getNameCompany() == null;

    }

    @Override
    public int hashCode() {
        int result = getNameCompany() != null ? getNameCompany().hashCode() : 0;
        result = 31 * result + getNumberWorker();
        return result;
    }

    @Override
    public String toString() {
        return "Company{" +
                "nameCompany='" + nameCompany + '\'' +
                ", numberWorker=" + numberWorker +
                '}';
    }
}

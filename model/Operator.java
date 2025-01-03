package model;

public class Operator{
    private int employeeid ;
    private String name ;
    private String emailid ;

    public Operator(int employeeid ,String name,String emailid){
        this.employeeid=employeeid ;
        this.name=name ;
        this.emailid=emailid ;
    }
    public int getEmployeeid() {
        return employeeid;
    }

    public void setEmployeeid(int employeeid) {
        this.employeeid = employeeid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
}
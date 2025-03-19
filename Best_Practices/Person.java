class Person{

    public String Name;
    public String Address;
    public String Email;

    Person(String Name){
       this.Name=Name;
    }
    Person(String Name, String Address){
       this(Name);
       this.Address=Address;
    }
    Person(String Name, String Address, String Email){
        this(Name,Address);
        this.Email=Email;
    }
    String GetPersonInfo(){
        return "Name :"+Name+"\n"+"Address :"+Address+"\n"+"Email : "+Email+"\n";
    }


}
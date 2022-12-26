package ClassPackage;

public class Alumne {
    //region ATTRIBUTES
    private String name;
    private byte age;
    private String curse;
    private byte note;


    //endregion ATTRIBUTES


    //region CONSTRUCTOR

    public Alumne(String name, byte age, String curse, byte note) {
        this.name = name;
        this.age = age;
        this.curse = curse;
        this.note = note;
    }

    //endregion CONSTRUCTOR


    //region GETTERS & SETTERS

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getCurse() {
        return curse;
    }

    public void setCurse(String curse) {
        this.curse = curse;
    }

    public byte getNote() {
        return note;
    }

    public void setNote(byte note) {
        this.note = note;
    }

    //endregion GETTERS & SETTERS


    //region METHODS
    @Override
    public String toString(){
        return String.format("NAME: %s; AGE: %S; COURSE: %s; NOTE: %s\r\n",this.name, this.age, this.curse, this.note);
    }
    //endregion METHODS


}

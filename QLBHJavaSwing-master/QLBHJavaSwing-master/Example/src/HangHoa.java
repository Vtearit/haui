
public class HangHoa {
    private String ID;
    private String Name;
    private int Quality;
    private long Price;
    private String type;

    public HangHoa(String ID, String Name, int Quality, long Price, String type) {
        this.ID = ID;
        this.Name = Name;
        this.Quality = Quality;
        this.Price = Price;
        this.type = type;
    }

    HangHoa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getQuality() {
        return Quality;
    }

    public long getPrice() {
        return Price;
    }

    public String getType() {
        return type;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setQuality(int Quality) {
        this.Quality = Quality;
    }

    public void setPrice(long Price) {
        this.Price = Price;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    public Object[] toArray(){
    return new Object[] {ID,Name,Quality,Price,type};
    }
}

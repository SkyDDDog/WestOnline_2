public abstract class Cat {
    //定义变量
    protected int catId;
    protected String catName;
    protected int catAge;
    protected boolean gender;               //默认true为母
    protected double buyCat;

    //get set方法

    public int getCatId() {
        return catId;
    }

    public void setCatId(int catId) {
        this.catId = catId;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public int getCatAge() {
        return catAge;
    }

    public void setCatAge(int catAge) {
        this.catAge = catAge;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public double getBuyCat() {
        return buyCat;
    }

    public void setBuyCat(double buyCat) {
        this.buyCat = buyCat;
    }

    public Cat(int catId, String catName, int catAge, boolean gender, double buyCat) {
        this.catId = catId;
        this.catName = catName;
        this.catAge = catAge;
        this.gender = gender;
        this.buyCat = buyCat;
    }

    public Cat(String catName, int catAge, boolean gender, double buyCat) {
        this.catName = catName;
        this.catAge = catAge;
        this.gender = gender;
        this.buyCat = buyCat;
    }

    public Cat(String catName, int catAge, String gender, double buyCat) {
    }

    @Override
    public abstract String toString();

}

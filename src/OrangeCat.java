public class OrangeCat extends Cat{
    protected boolean isFat;



    //set get方法
    public boolean isFat() {
        return isFat;
    }

    public void setFat(boolean fat) {
        isFat = fat;
    }

    //构造方法
//    public OrangeCat(int catId,String catName, int catAge, boolean gender, double buyCat, boolean isFat) {
//        super(catName, catAge, gender, 200);
//    }

    public OrangeCat(int catId, String catName, int catAge, boolean gender, double buyCat, boolean isFat) {
        super(catId, catName, catAge, gender, buyCat);
        this.isFat = isFat;
    }

    public OrangeCat(String catName, int catAge, boolean gender, double buyCat, boolean isFat) {
        super(catName, catAge, gender, buyCat);
        this.isFat = isFat;
    }

    public OrangeCat(String catName, int catAge, String gender, double buyCat, boolean isFat) {
        super(catName, catAge, gender, buyCat);
        this.isFat = isFat;
    }

    @Override
    public String toString() {
        if (isGender()||isFat) {
            return  "这只小可爱的名字是: " + getCatName() + '\n' +
                    "她" + getCatAge() +"岁了哦\n"+
                    "是一个身价" + getBuyCat() +"的小肥猪"
                    ;
        }
        else if (isGender()||!isFat) {
            return  "这只小可爱的名字是:'" + getCatName() + '\n' +
                    "她" + getCatAge() +"岁了哦\n"+
                    "是一个身价" + getBuyCat() +"的小小猫"
                    ;
        }
        else if (!isGender()||isFat) {
            return  "这只小可爱的名字是:'" + getCatName() + '\'' +
                    "他" + getCatAge() +"岁了哦\n"+
                    "身价" + getBuyCat() +"小肥猪"
                    ;
        }
        else {
            return "这只小可爱的名字是:'" + getCatName() + '\'' +
                    "他" + getCatAge() + "岁了哦\n" +
                    "身价" + getBuyCat() + "小小猫"
                    ;
        }
    }
}

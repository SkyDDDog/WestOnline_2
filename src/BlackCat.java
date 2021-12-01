public class BlackCat extends Cat {
    public BlackCat(int catId,String catName, int catAge, boolean gender, double buyCat) {
        super(catName, catAge, gender, 350);
    }

    @Override
    public String toString() {
        if (isGender()) {
            return  "这位高贵的黑猫名曰: " + catName + "\n" +
                    "她年芳" + catAge +"\n"+
                    "身价" + buyCat + '哦';
        }
        else {
            return  "这位高贵的黑猫名曰:'" + catName + "\n" +
                    "他" + catAge +"岁了\n"+
                    "身价" + buyCat + '哦';
        }

    }
}

public class ThreeFelinae extends Cat{//三花猫 学名Three Felinae

//    public ThreeFelinae(int catId,String catName, int catAge, String gender, double buyCat) {
//        super(catName, catAge, gender, 153977);
//    }

    public ThreeFelinae(int catId,String catName, int catAge, boolean gender, double buyCat) {
        super(catName, catAge, gender, buyCat);
    }

    @Override
    public String toString() {
        if (isGender()) {
            return  "这只可爱的三花猫叫做" + catName + "哦\n" +
                    "她" + catAge +"岁了\n"+
                    "价值" + buyCat ;
        }
        else {
            return  "这只可爱的三花猫叫做" + catName + "哦\n" +
                    "他" + catAge +"岁了\n"+
                    "价值" + buyCat;
        }

    }
}

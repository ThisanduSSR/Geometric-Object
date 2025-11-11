public class SimpleThem {
    String name;
    String[] commonAttacks;

    SimpleThem(String name, String[] commonAttacks) {
        this.name = name;
        this.commonAttacks = commonAttacks;

    }
    void showInfo() {
        System.out.println("Domain:"+name);
        System.out.println("common Attacks:");
        for(String attack: commonAttacks){
            System.out.println("  -"+ attack);
        }
        System.out.println();
    }
}

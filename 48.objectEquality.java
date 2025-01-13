import java.util.Objects;

class objectEquality {
      private String name;
      private int age;

      objectEquality(String name, int age) {
          this.name = name;
          this.age = age;
      }
      public boolean equal(Object obj) {
          if (this == obj) {
              return true;
          }if (obj==null || getClass() !=obj.getClass()){
              return false;
          }
          objectEquality objectEquality=(objectEquality)obj;
          return age==objectEquality.age && (Objects.equals(name, objectEquality.name));
      }

    @Override
    public int hashCode() {
        return Objects.hash(name,age);
    }

    public static void main(String[] args) {
        objectEquality p1=new objectEquality("nilesh",24);
        objectEquality p2=new objectEquality("nilesh",24);
        System.out.println(p1.equal(p2));
        System.out.println("p1 hashcode : "+p1.hashCode());
        System.out.println("p2 hashcode : "+p2.hashCode());
    }
}

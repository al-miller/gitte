/**
 * Created by almiller on 3/28/2016.
 */
public class Person {



        private ServiceDL _serviceDL;
        public static final Double pi = 3.1415921;

        protected String name;
        protected Integer age;

        Person() {
        }

        Person(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public void showInfo() {
            System.out.println("Person: \n" + getName() + " " + getAge() + "\n");
        }


        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getAge() {
            return age;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public ServiceDL getServiceDL() {
            return _serviceDL;
        }

        public void setServiceDL(ServiceDL _serviceDL) {
            this._serviceDL = _serviceDL;
        }

}

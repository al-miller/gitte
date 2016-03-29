/**
 * Created by almiller on 3/29/2016.
 */

    import java.util.Calendar;
    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;

    /**
     * Created by almiller on 3/17/2016.
     */
    public class ServiceDL {

        public List<Employee> getCoWorkers(String name){
            return null;
        }
        public Map<Employee, Integer> getEmployeesMap(String name){
            Map<Employee,Integer> map = new HashMap<Employee,Integer>();
            for(int i=0; i<10; i++)
            {
                String s=Integer.toString(i);
                map.put(new Employee("A"+s,10*i, 100*i+0.5),i);

            }
            return map;
        }
        void printMap(Map<Employee,Integer> m)

        {
            System.out.println(m);
        }
        long printNow(){
            long now = System.currentTimeMillis();

            return now;
        }
        Calendar printGetInstance(){
            Calendar rightNow = Calendar.getInstance();

            return rightNow;


        }



    }







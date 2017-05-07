public class Solution {

        public static void main(String[] args){
                Student student = new Student();
            Method[] methods = Student.class.getDeclaredMethods();

            ArrayList<String> methodList = new ArrayList<>();
         for (Method method : methods) {
             methodList.add(method.getName());
         }
            Collections.sort(methodList);
            for(String name: methodList){
                System.out.println(name);
            }
        }

    }

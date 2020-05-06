package asafov.com;

import java.util.*;

public class CampusCup {

    class School{
        String name;
        int points;
        int space;
        public School(String name, int points) {
            this.name = name;
            this.points = points;
            this.space=0;
        }

        @Override
        public boolean equals(Object obj) {
            School sc = (School)obj;
            return this.name.equals(sc.name);
        }

        @Override
        public String toString() {
            return "School{" +
                    "name='" + name + '\'' +
                    ", points=" + points +
                    ", space=" + space +
                    '}';
        }
    }

    String[] campusCup(String[] emails) {
        List<School> list = new ArrayList<>();
        Set<String> schools = new HashSet<>();
        for (String str : emails){
            String[] sc = str.split("@");
            if (schools.contains(sc[1])){
                School school = new School(sc[1],20);
                int index = list.indexOf(school);
                School s = list.get(index);
                s.points=s.points+20;
                if (s.points==100){
                    s.space=3;
                }else if (s.points==200){
                    s.space=s.space+8;
                }else if (s.points==300){
                    s.space=s.space+15;
                }else if (s.points==500){
                    s.space=s.space+25;
                }
                list.set(index,s);
            }else{
                School school = new School(sc[1],20);
                list.add(school);
                schools.add(sc[1]);
            }
        }
        list.sort(new Comparator<School>() {
            @Override
            public int compare(School o1, School o2) {
                if (o1.space<o2.space){
                    return 1;
                }else if (o1.space>o2.space){
                    return -1;
                }
                if (o1.name.compareTo(o2.name)>0){
                    return 1;
                }else {
                    return -1;
                }
            }
        });
        System.out.println(list.toString());
        String[] ans = new String[list.size()];
        for (int i=0;i<list.size();i++){
            ans[i]=list.get(i).name;
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] emails = {
                "b@rain.ifmo.ru",
                "c@rain.ifmo.ru",
                "d@rain.ifmo.ru",
                "e@rain.ifmo.ru",
                "f@rain.ifmo.ru",
                "g@rain.ifmo.ru",
                "h@rain.ifmo.ru",
                "i@rain.ifmo.ru",
                "j@rain.ifmo.ru",
                "k@rain.ifmo.ru",
                "l@rain.ifmo.ru",
                "m@rain.ifmo.ru",
                "n@rain.ifmo.ru",
                "o@rain.ifmo.ru",
                "p@rain.ifmo.ru",
                "q@rain.ifmo.ru",
                "r@rain.ifmo.ru",
                "s@rain.ifmo.ru",
                "t@rain.ifmo.ru",
                "u@rain.ifmo.ru",
                "v@rain.ifmo.ru",
                "w@rain.ifmo.ru",
                "x@rain.ifmo.ru",
                "y@rain.ifmo.ru",
                "a@mit.edu.ru",
                "b@mit.edu.ru",
                "c@mit.edu.ru",
                "d@mit.edu.ru",
                "e@mit.edu.ru",
                "f@mit.edu.ru",
                "g@mit.edu.ru",
                "h@mit.edu.ru",
                "i@mit.edu.ru",
                "j@mit.edu.ru",
                "k@mit.edu.ru",
                "l@mit.edu.ru",
                "m@mit.edu.ru",
                "n@mit.edu.ru",
                "o@mit.edu.ru"
        };
        String[] ans = new CampusCup().campusCup(emails);
        System.out.println(Arrays.toString(ans));
    }
}

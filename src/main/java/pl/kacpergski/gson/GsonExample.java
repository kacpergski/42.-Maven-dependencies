package pl.kacpergski.gson;

import com.google.gson.Gson;

public class GsonExample {

    public static void main(String[] args) {
        Person p1 = new Person("Jan",33);
        Person p2 = new Person("Ada",18);
        System.out.println(p1);
        System.out.println(p2);

        Gson gson = new Gson();

        String json = gson.toJson(p1);
        System.out.println(json);
        String json2 = gson.toJson(p2);
        System.out.println(json2);

        Person [] people = {p1,p2};
        System.out.println(gson.toJson(people));
    }

}

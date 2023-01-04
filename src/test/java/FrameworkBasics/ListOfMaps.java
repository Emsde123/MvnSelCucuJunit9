package FrameworkBasics;

public class ListOfMaps {
    // Maps deal with Keys and Values, it will natively understand JSON files.
    // Maps have a direct relationship with JSON, but we can convert formats so maps will understand.

    // name         | lastName       | gender | hobby     | age
    // Shabnam      | Gurbanzade     | female | movies    | 25
    // Seymur       | Hasanov        | male   | chess     | 26
    // James        | Hazell         | male   | coding    | 27
    // Derya        | Zi             | female | climbing  | 24


    //          Key     Value
    // List<Map<String, Object>>

    // Changing the value from String to Object allows a wider variety of data types, we can use everything.
    // from the above table, we will be retrieving 4 lists.

    // Now we have about 20 maps, with 4 lists.

    // List1<Map1<name, Shabnam>>
    // List1<Map2<lastName, Gurbanzade>>
    // List1<Map3<gender, female>>
    // List1<Map4<hobby, movies>>
    // List1<Map5<age, 25>>

    // List2<Map1<name, Seymur>>
    // List2<Map2<lastName, Hasanov>>
    // List2<Map3<gender, male>>
    // List2<Map4<hobby, chess>>
    // List2<Map5<age, 26>>

    // List3<Map1<name, James>>
    // List3<Map2<lastName, Hazell>>
    // List3<Map3<gender, male>>
    // List3<Map4<hobby, coding>>
    // List3<Map5<age, 27>>

    // List4<Map1<name, Derya>>
    // List4<Map2<lastName, Zi>>
    // List4<Map3<gender, female>>
    // List4<Map4<hobby, cliimbing>>
    // List4<Map5<age, 24>>

}

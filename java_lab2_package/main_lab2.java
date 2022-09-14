package java_lab2_package;


import java.util.*;
import java.util.Scanner;
import java_Phone_package.Phone;

public class main_lab2 {
    public static void main(String[] args) {
        //System.out.println("Enter number on Phone elements: ");
        Scanner scanner = new Scanner(System.in);
        //int elem_num = scanner.nextInt();
        //scanner.nextLine();
        int elem_num = 5;
        Phone[] arr = create_arr(elem_num);
        populate_arr(arr, elem_num);
        System.out.print("Local minutes higher than: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println("With local minutes higher than " + n + ":\n");
        Queue<Phone> local_minutes_higher = local_min_higher( arr , n , elem_num );
        print_queue(local_minutes_higher);
        System.out.println("With used international minutes:\n");
        Queue<Phone> used_intern_minutes = used_intern_min( arr , n , elem_num );
        print_queue(used_intern_minutes);
        System.out.print("Print the begining of diapasone of account_number: ");
        int start = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Print the end of diapasone of account_number: ");
        int end = scanner.nextInt();
        scanner.nextLine();
        scanner.close();
        System.out.println("With account number higher than "+ start +" and lower than " + end + ":\n");
        Queue<Phone> accounts_in_range = account_num_in_range( arr , start, end , elem_num );
        print_queue(accounts_in_range);
    }

    public static void populate_arr(Phone arr[], int elem_num){
        int ids[] = {12,33,22,54,15};
        String Lastnames[] = {"Miller","Potter","Yahnyshchak", "Allen", "Bolton"};
        String patronymics[] = {"Oliverovich","Jamesovich","Olehovich","Chrisovich","Edwardovich"};
        int account_numbers[] = {343214,174535,109846,836354,109876};
        int local_minutes_arr[] = {120,79,45,190,101};
        int international_minutes_arr[] = {15,0,30,50,12};
        for (int i = 0; i < elem_num; i++){
            arr[i].set_id(ids[i]);
            arr[i].set_Lastname(Lastnames[i]);
            arr[i].set_patronymic(patronymics[i]);
            arr[i].set_account_number(account_numbers[i]);
            arr[i].set_local_minutes(local_minutes_arr[i]);
            arr[i].set_international_minutes(international_minutes_arr[i]); 
        }
    }
    public static Queue<Phone> local_min_higher ( Phone[] arr , int n, int elem_num ){
        Queue<Phone> min_higher = new LinkedList<Phone>();
        for (int i = 0; i < elem_num ;i++){
            if (arr[i].get_local_minutes() > n){
                min_higher.add(arr[i]);
            }
        }
        return min_higher;
    }
    public static Phone[] create_arr(int elem_num){
        Phone[] arr = new Phone [elem_num];//create_arr(elem_num);
        for (int i=0;i<elem_num;i++){
            arr[i] = new Phone();
        } 
        return arr;
    }

    public static Queue<Phone> used_intern_min (Phone[] arr , int n, int elem_num){
        Queue<Phone> used_intern = new LinkedList<Phone>();
        for (int i = 0; i < elem_num ;i++){
            if (arr[i].get_international_minutes() > 0){
                used_intern.add(arr[i]);
            }
        }
        return used_intern;
    }
    public static void print_queue ( Queue<Phone> queue){
        Phone obj = queue.poll();
        if (obj == null){
            System.out.println( "The queue is empty");
            return;
        }
        obj.print_columns();
        while (obj != null){
            System.out.println(obj.toString());
            obj = queue.poll();
        }
    }
    public static Queue<Phone> account_num_in_range(Phone[] arr , int start,int end, int elem_num){
        Queue<Phone> accounts_in_range = new LinkedList<Phone>();
        for (int i = 0; i < elem_num ;i++){
            if (arr[i].get_account_number() >= start && arr[i].get_account_number() <= end){
                accounts_in_range.add(arr[i]);
            }
        }
        return accounts_in_range;
    }
    public static void input_arr(Scanner scanner, Phone[] arr, int elem_num){
        System.out.println();
        for (int i = 0; i < elem_num; i++){
            System.out.print("Enter id: ");
            int id = scanner.nextInt();
            scanner.nextLine();
            arr[i].set_id(id);
            System.out.print("Enter Lastname: ");
            String Lastname = scanner.nextLine();
            arr[i].set_Lastname(Lastname);
            System.out.print("Enter patronymics: ");
            String patronymic = scanner.nextLine();
            arr[i].set_patronymic(patronymic);
            System.out.print("Enter account number: ");
            int account_number = scanner.nextInt();
            scanner.nextLine();
            arr[i].set_account_number(account_number);
            System.out.print("Enter local minutes: ");
            int local_minutes = scanner.nextInt();
            scanner.nextLine();
            arr[i].set_local_minutes(local_minutes);
            System.out.print("Enter international minutes: ");
            int international_minutes = scanner.nextInt();
            scanner.nextLine();
            arr[i].set_international_minutes(international_minutes); 
        }
    }
}

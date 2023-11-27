package shoppingapp;

import java.util.Scanner;


public class ShoppingApplication {
	

/**
 * @author Sai Madhava kalyan
 *
 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("\t \t \t..................WELCOME TO SHOPPING MALL....................");
		System.out.println();
		System.out.println(ShoppingSections.sections);
		System.out.println("select your choice");
		int choice = sc.nextInt();

		// first switch
		switch(choice) {
		
		
		
		//--------------------------------------------------------------home decors------------------------------------------------/
		
		// case for home decors
		case 1:{
			System.out.println();
			System.out.println("welcome to home decors");
			System.out.println(ShoppingSections.sub_secs_in_sec_1);
			System.out.println("enter your choice");

			int sec_choice = sc.nextInt();
			// switch for home decors
			switch(sec_choice) {
			// case for furnitures
			case 1:{
				System.out.println();
				System.out.println("welcome to furnitures");
				System.out.println(ShoppingSections.items_in_sub_sec_1_in_sec_1);
				System.out.println("enter your choice");

				int item_choice = sc.nextInt();
				// switch for furnitures selection
				switch(item_choice){
				case 1:{
					System.out.println("-----------------------features of chair---------------------------");
					System.out.println(ShoppingSections.chair_feature);
					System.out.println("Do you want to buy (yes/no)");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  chair");
						System.out.println(ShoppingSections.chairs_bill);
					}
					
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				case 2:{
					System.out.println("-----------------------features of bench---------------------------");
					System.out.println(ShoppingSections.bench_feature);
					System.out.println("Do you want to buy (yes /no)");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  bench");
						System.out.println(ShoppingSections.benches_bill);
					}
					
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				default:{
					System.out.println("enter proper value");
					break;
				}
				}
				break;
			}
			// case for blankets
			case 2:{
				System.out.println();
				System.out.println("welcome to Blankets");
				System.out.println(ShoppingSections.items_in_sub_sec_2_in_sec_1);
				System.out.println("enter your choice");

				int item_choice = sc.nextInt();
				// switch for blanket selection
				switch(item_choice){
				case 1:{
					System.out.println("-----------------------features of Andhra blanket---------------------------");
					System.out.println(ShoppingSections.a_blanket_feature);
					System.out.println("Do you want to buy (yes /no)");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  Andhra blanket");
						System.out.println(ShoppingSections.Andhra_blanket_bill);
					}
					
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				case 2:{
					System.out.println("------------------------------feature of rajasthani blanket------------------------------");
					System.out.println(ShoppingSections.r_blanket_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if (s.equals("yes")) {
						System.out.println("you buyed an item  rajasthani blanket");
						System.out.println(ShoppingSections.Rajasthan_blanket_bill);	
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				default:{
					System.out.println("enter proper value");
					break;
				}
				}
				break;
			}
			// case for karpets
			case 3:{
				System.out.println();
				System.out.println("welcome to Karpets");
				System.out.println(ShoppingSections.items_in_sub_sec_3_in_sec_1);
				System.out.println("enter your choice");
				int item_choice = sc.nextInt();
				// switch for selecting karpets
				switch(item_choice){
				case 1:{
					System.out.println("-----------------------------------feature of color carpets---------------------------------");
					System.out.println(ShoppingSections.c_carpet_feature);
					System.out.println("Do you want to buy an item");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  color carpets");
						System.out.println(ShoppingSections.Color_carpets_bill);	
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				case 2:{
					System.out.println("--------------------------------------feature of plane carpets-----------------------------");
					System.out.println(ShoppingSections.p_carpet_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  plane carpets");	
						System.out.println(ShoppingSections.Plane_carpets_bill);
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				default:{
					System.out.println("enter proper value");
					break;
				}
				}
				break;
			}
			// case for kitchen decoradors
			case 4:{
				System.out.println();
				System.out.println("welcome to Kitchen decoradors");
				System.out.println(ShoppingSections.items_in_sub_sec_4_in_sec_1);
				System.out.println("enter your choice");

				int item_choice = sc.nextInt();
				// switch for selecting kitchen items
				switch(item_choice){
				case 1:{
					System.out.println("-----------------------------features of stove--------------------------------------");
					System.out.println(ShoppingSections.stove_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  stove");
						System.out.println(ShoppingSections.stove_bill);
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				case 2:{
					System.out.println("-----------------------------feature of cylinder-------------------------------------");
					System.out.println(ShoppingSections.cylinder_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  cylinder");
						System.out.println(ShoppingSections.cylinder_bill);	
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				default:{
					System.out.println("enter proper value");
					break;
				}
				}
				break;
			}
			default:{
				System.out.println("enter proper value: ");
				main(null);
			}
			}
			break;
			
			// closing for home decors
		}
		
		
		
		
		
		//-------------------------------------------------electronics section------------------------------------------------------/
		
		
		// case for electronics
		case 2:{
			System.out.println();
			System.out.println("welcome to ELECTRONICS");
			System.out.println(ShoppingSections.sub_secs_in_sec_2);
			System.out.println("enter your choice");

			int sec_choice = sc.nextInt();
			// switch for electronic items 
			switch(sec_choice) {
			// case for mobiles
			case 1:{
				System.out.println();
				System.out.println("welcome to mobiles");
				System.out.println(ShoppingSections.items_in_sub_sec_1_in_sec_2);
				System.out.println("enter your choice");

				int item_choice = sc.nextInt();
				// switch for mobile items
				switch(item_choice){
				case 1:{
					System.out.println("----------------------------feature of vivo-----------------------------------");
					System.out.println(ShoppingSections.vivo_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  vivo");
						System.out.println(ShoppingSections.vivo_bill);	
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				case 2:{
					System.out.println("-----------------------------------feature of oppo-----------------------------------------");
					System.out.println(ShoppingSections.oppo_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  oppo");
						System.out.println(ShoppingSections.oppo_bill);
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				default:{
					System.out.println("enter proper value");
					break;
				}
				}
				break;
			}
			// case for headphones in electronics 
			case 2:{
				System.out.println();
				System.out.println("welcome to head phones ");
				System.out.println(ShoppingSections.items_in_sub_sec_2_in_sec_2);
				System.out.println("enter your choice");

				int item_choice = sc.nextInt();
				// switch for selecting types of inputs
				switch(item_choice){
				case 1:{
					System.out.println("-----------------------------------feature of one plus ear phones-----------------------------------------");
					System.out.println(ShoppingSections.one_plus_ear_phone_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  one plus ear phones ");
						System.out.println(ShoppingSections.one_plus_ear_phones_bill);	
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				case 2:{
					System.out.println("-----------------------------------feature of realme ear phones-----------------------------------------");
					System.out.println(ShoppingSections.realme_ear_phone_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  real me ear phones");
						System.out.println(ShoppingSections.real_me_ear_phones_bill);	
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				default:{
					System.out.println("enter proper value");
					break;
				}
				}
				break;
			}
			// case for laptops in electronics
			case 3:{
				System.out.println();
				System.out.println("welcome to laptops");
				System.out.println(ShoppingSections.items_in_sub_sec_3_in_sec_2);
				System.out.println("enter your choice");

				int item_choice = sc.nextInt();
				// switch for types in laptop
				switch(item_choice){
				case 1:{
					System.out.println("-----------------------------------feature of lenovo lap-----------------------------------------");
					System.out.println(ShoppingSections.lenovo_lap_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  lenovo lap");
						System.out.println(ShoppingSections.Lenovo_lap_bill);	
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				case 2:{
					System.out.println("-----------------------------------feature of hp lap-----------------------------------------");
					System.out.println(ShoppingSections.hp_laptop_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  hp lap");
						System.out.println(ShoppingSections.hp_lap_bill);	
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				default:{
					System.out.println("enter proper value");
					break;
				}
				}
				break;
			}
			// case for tabs in electronics
			case 4:{
				System.out.println();
				System.out.println("welcome to tabs");
				System.out.println(ShoppingSections.items_in_sub_sec_4_in_sec_2);
				System.out.println("enter your choice");

				int item_choice = sc.nextInt();
				//  switch for types in tabs
				switch(item_choice){
				case 1:{
					System.out.println("-----------------------------------feature of nokia tab-----------------------------------------");
					System.out.println(ShoppingSections.nokia_tab_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  nokia tab");
						System.out.println(ShoppingSections.nokia_tab_bill);
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				case 2:{
					System.out.println("-----------------------------------feature of samsung tab-----------------------------------------");
					System.out.println(ShoppingSections.samsung_tab_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  samsung tab");
						System.out.println(ShoppingSections.samsung_tab_bill);	
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				default:{
					System.out.println("enter proper value");
					break;
				}
				}
				break;
			}
			default:{
				System.out.println("enter proper value: ");
				main(null);
			}
			}
			break;
		}
		
		
		
		
		//------------------------------------------------------------fashions---------------------------------------------------/
		
		
		
		
		// case for fashions
		case 3:{
			System.out.println();
			System.out.println("welcome to Fashion");
			System.out.println(ShoppingSections.sub_secs_in_sec_3);

			int sec_choice = sc.nextInt();
			// switch for fashion items
			switch(sec_choice) {
			case 1:{
				System.out.println();
				System.out.println("welcome to men");
				System.out.println(ShoppingSections.items_in_sub_sec_1_in_sec_3);
				System.out.println("enter your choice");

				int item_choice = sc.nextInt();
				// switch for selecting men items
				switch(item_choice){
				case 1:{
					System.out.println("-----------------------------------feature of shirt-----------------------------------------");
					System.out.println(ShoppingSections.shirts_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  shirts");
						System.out.println(ShoppingSections.shirts_bill);	
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				case 2:{
					System.out.println("---------------------------feature of shirt----------------------------------");
					System.out.println(ShoppingSections.pants_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  pants");
						System.out.println(ShoppingSections.pants_bill);
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				default:{
					System.out.println("enter proper value");
					break;
				}
				}
				break;
			}
			// case women items
			case 2:{
				System.out.println();
				System.out.println("welcome to women");
				System.out.println(ShoppingSections.items_in_sub_sec_2_in_sec_3);
				System.out.println("enter your choice");

				int item_choice = sc.nextInt();
				// switch for selecting women items
				switch(item_choice){
				case 1:{
					System.out.println("---------------------------feature of panjabi----------------------------------");
					System.out.println(ShoppingSections.panjabi_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  panjabi");
						System.out.println(ShoppingSections.panjabi_bill);	
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}					break;
				}
				case 2:{
					System.out.println("---------------------------feature of langa voni----------------------------------");
					System.out.println(ShoppingSections.langa_voni_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  langa voni");
						System.out.println(ShoppingSections.langa_voni_bill);	
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				default:{
					System.out.println("enter proper value");
					break;
				}
				}
				break;
			}
			// case for childrns items
			case 3:{
				System.out.println();
				System.out.println("welcome to children");
				System.out.println(ShoppingSections.items_in_sub_sec_3_in_sec_3);
				System.out.println("enter your choice");

				int item_choice = sc.nextInt();
				// switch for selecting children items
				switch(item_choice){
				case 1:{
					System.out.println("---------------------------feature of t-shirts ----------------------------------");
					System.out.println(ShoppingSections.t_shirts_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  t-shirts");
						System.out.println(ShoppingSections.t_shirts_bill);	
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				case 2:{
					System.out.println("---------------------------feature of shorts ----------------------------------");
					System.out.println(ShoppingSections.shots_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  shorts");
						System.out.println(ShoppingSections.shots_bill);	
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				default:{
					System.out.println("enter proper value");
					break;
				}
				}
				break;
			}
			default:{
				System.out.println("enter proper value: ");
				main(null);
			}
			}
			break;
		}
		
		
		
		
		
		//-------------------------------------------------- INSTAMART -----------------------------------------------------------------/
		
		
		
		// case for fashions
		case 4:{
			System.out.println();
			System.out.println("welcome to Instamart");
			System.out.println(ShoppingSections.sub_secs_in_sec_4);
			System.out.println("enter your choice");

			int sec_choice1 = sc.nextInt();
			// Switch for fashion items
			switch(sec_choice1) {
			// case for  fruits & veg
			case 1:{
				System.out.println();
				System.out.println("welcome to Fruits & veg");
				System.out.println(ShoppingSections.items_in_sub_sec_1_in_sec_4);
				System.out.println("enter your choice");

				int item_choice = sc.nextInt();
				// switch for selecting fruit & veg items
				switch(item_choice){
				case 1:{
					System.out.println("---------------------------feature of apples ----------------------------------");
					System.out.println(ShoppingSections.apple_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  appples");
						System.out.println(ShoppingSections.apples_bill);	
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				case 2:{
					System.out.println("---------------------------feature of oranges ----------------------------------");
					System.out.println(ShoppingSections.orange_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  oranges");
						System.out.println(ShoppingSections.orange_bill);
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}					break;
				}
				default:{
					System.out.println("enter proper value");
					break;
				}
				}
				break;
			}
			// case for  serlacs
			case 2:{
				System.out.println();
				System.out.println("welcome to serlacs");
				System.out.println(ShoppingSections.items_in_sub_sec_2_in_sec_4);
				System.out.println("enter your choice");

				int item_choice = sc.nextInt();
				// switch for selecting serlac items
				switch(item_choice){
				case 1:{
					System.out.println("---------------------------feature of nestle serlac ----------------------------------");
					System.out.println(ShoppingSections.nestle_serlac_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  nestle serlac");
						System.out.println(ShoppingSections.nestle_serlac_bill);
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				case 2:{
					System.out.println("---------------------------feature of castle serlac ----------------------------------");
					System.out.println(ShoppingSections.castle_serlac_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  castle serlac");
						System.out.println(ShoppingSections.castle_serlac_bill);
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				default:{
					System.out.println("enter proper value");
					break;
				}
				}
				break;
			}
			// case for  juices in  instamart
			case 3:{
				System.out.println();
				System.out.println("welcome to Juices");
				System.out.println(ShoppingSections.items_in_sub_sec_3_in_sec_4);
				System.out.println("enter your choice");

				int item_choice = sc.nextInt();
				// case for selecting types of juices
				switch(item_choice){
				case 1:{
					System.out.println("---------------------------feature of pine apple juice----------------------------------");
					System.out.println(ShoppingSections.pine_apple_juice_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  pine apple juice");
						System.out.println(ShoppingSections.pine_apple_juice_bill);
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}					break;
				}
				case 2:{
					System.out.println("---------------------------feature of pine grapes juice----------------------------------");
					System.out.println(ShoppingSections.grapes_juice_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  grapes juice");
						System.out.println(ShoppingSections.grapes_juice_bill);	
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				default:{
					System.out.println("enter proper value");
					break;
				}
				}
				break;
			}
			// case for provisions
			case 4:{
				System.out.println();
				System.out.println("welcome to Provisions");
				System.out.println(ShoppingSections.items_in_sub_sec_4_in_sec_4);
				System.out.println("enter your choice");

				int item_choice = sc.nextInt();
				// switch for selecting provision items
				switch(item_choice){
				case 1:{
					System.out.println("---------------------------feature of pesarapappu----------------------------------");
					System.out.println(ShoppingSections.pesarapappu_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  pesarapappu");
						System.out.println(ShoppingSections.pesarapappu_bill);
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				case 2:{
					System.out.println("---------------------------feature of kandhi pappu----------------------------------");
					System.out.println(ShoppingSections.kandhi_pappu_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  kandhipappu");
						System.out.println(ShoppingSections.kandhi_pappu_bill);
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				default:{
					System.out.println("enter proper value");
					break;
				}
				}
				break;
			}
			default:{
				System.out.println("enter proper value: ");
				main(null);
			}
			}
			break;
		}
		
		
		
		
		//----------------------------------------------------------sports-------------------------------------------------------/
		
		
		
		
		// case for  sports
		case 5:{
			System.out.println();
			System.out.println("welcome to sports");
			System.out.println(ShoppingSections.sub_secs_in_sec_5);
			System.out.println("enter your choice");

			int sec_choice = sc.nextInt();
			 
			switch(sec_choice) {
			// case for sports wear
			case 1:{
				System.out.println();
				System.out.println("welcome to Sports wear");
				System.out.println(ShoppingSections.items_in_sub_sec_1_in_sec_5);
				System.out.println("enter your choice");


				int item_choice = sc.nextInt();
				// switch for selecting sports wear items
				switch(item_choice){
				case 1:{
					System.out.println("---------------------------feature of sleeve less shirts----------------------------------");
					System.out.println(ShoppingSections.sleeve_less_t_shirts_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  sleeve less t-shirts ");
						System.out.println(ShoppingSections.sleeve_less_t_shirts_bill);	
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				case 2:{
					System.out.println("---------------------------feature of sports shorts----------------------------------");
					System.out.println(ShoppingSections.sports_shorts_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  sports shorts");
						System.out.println(ShoppingSections.sports_shorts_bill);
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				default:{
					System.out.println("enter proper value");
					break;
				}
				}
				break;
			}
			// case for  sport shoes
			case 2:{
				System.out.println();
				System.out.println("welcome to Sport shoes");
				System.out.println(ShoppingSections.items_in_sub_sec_2_in_sec_5);
				System.out.println("enter your choice");

				int item_choice = sc.nextInt();
				// switch for selecting sport shoe items
				switch(item_choice){
				case 1:{
					System.out.println("---------------------------feature of nike shoes----------------------------------");
					System.out.println(ShoppingSections.nike_shoes_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  nike shoes");
						System.out.println(ShoppingSections.nike_shoes_bill);
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}					break;
				}
				case 2:{
					System.out.println("---------------------------feature of sports shoes----------------------------------");
					System.out.println(ShoppingSections.sports_shoes_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  sports shoes");
						System.out.println(ShoppingSections.sports_shoes_bill);
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				default:{
					System.out.println("enter proper value");
					break;
				}
				}
				break;
			}
			// case for sports equipments
			case 3:{
				System.out.println();
				System.out.println("welcome to Sport equipments");
				System.out.println(ShoppingSections.items_in_sub_sec_3_in_sec_5);
				System.out.println("enter your choice");

				int item_choice = sc.nextInt();
				// switch for selecting sports equipment items 
				switch(item_choice){
				case 1:{
					System.out.println("---------------------------feature of bat----------------------------------");
					System.out.println(ShoppingSections.bat_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  bat");
						System.out.println(ShoppingSections.bat_bill);	
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				case 2:{
					System.out.println("---------------------------feature of ball----------------------------------");
					System.out.println(ShoppingSections.ball_feature);
					System.out.println("Do you want to buy");
					String s = sc.next();
					if(s.equals("yes")) {
						System.out.println("you buyed an item  ball");
						System.out.println(ShoppingSections.ball_bill);	
					}
					System.out.println(".......................THANK YOU......................");
					System.out.println("Do you like to shop again");
					String opinion = sc.next();
					if(opinion.equals("yes")) {
						main(null);
					}
					else {
						main(null);
						System.out.println("please choose exit option");
					}
					break;
				}
				default:{
					System.out.println("enter proper value");
					break;
				}
				}
				break;
			}
			default:{
				System.out.println("enter proper value: ");
				main(null);
			}
			}
			break;
		}
		//--------------------------------------------------------------------EXIT----------------------------------------/
		case 6:{
			System.out.println("---------------------------------------- THANK   YOU --------------------------------------------");
			System.out.println("---------------------------------------- VISIT   AGAIN ------------------------------------------");
			System.exit(0);
			break;
		}
		default:{
			System.out.println();
			System.out.println("enter proper value");
			main(null);
			break;
		}
		}
	}

}
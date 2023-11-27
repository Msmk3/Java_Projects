package shoppingapp;


public class ShoppingSections {

	
	// sections in shopping mall
	
	
	public static String sections;
	
	static {
		sections = "1.HOME DECORS\n" + "2.ELECTRONICS\n" + "3.FASHIONS\n" + "4.INSTAMART\n" + "5.Sports\n" + "6.EXIT";
	}
	
	// sub sections in sections(HOME DECORS) in shopping mall
	public static String sub_secs_in_sec_1;
	public static String sub_secs_in_sec_2;
	public static String sub_secs_in_sec_3;
	public static String sub_secs_in_sec_4;
	public static String sub_secs_in_sec_5;
	
	static {
		sub_secs_in_sec_1 = "1.Furnitures\n" + "2.Blankets\n" + "3.carpets\n" + "4.Kitchen Decors\n";
		sub_secs_in_sec_2 = "1.Mobiles\n" + "2.HeadPhones\n" + "3.Laptops\n" + "4.Tabs\n";
		sub_secs_in_sec_3 = "1.Men\n" + "2.Women\n" + "3.Children\n";
		sub_secs_in_sec_4 = "1.Fruits & veg\n" + "2.serlacs\n" + "3.Juices\n" + "4.Provisions";
		sub_secs_in_sec_5 = "1.Sports wear\n" + "2.Sport shoes\n" + "3.Sport equipments\n";
	}
	
	// items in sections 1
	public static String items_in_sub_sec_1_in_sec_1;
	public static String items_in_sub_sec_2_in_sec_1;
	public static String items_in_sub_sec_3_in_sec_1;
	public static String items_in_sub_sec_4_in_sec_1;
	
	static {
		items_in_sub_sec_1_in_sec_1 = "1.chairs\n" + "2.benches\n";
		items_in_sub_sec_2_in_sec_1 = "1.Andhra blanket\n" + "2.Rajasthan blanket\n";
		items_in_sub_sec_3_in_sec_1 = "1.color carpets\n" + "2.plane carpets\n";
		items_in_sub_sec_4_in_sec_1 = "1.Stove\n" + "2.cylinder\n";
	}
	
	// features of sections1
	public static String chair_feature;
	public static String bench_feature;
	public static String a_blanket_feature;
	public static String r_blanket_feature;
	public static String c_carpet_feature;
	public static String p_carpet_feature;
	public static String stove_feature;
	public static String cylinder_feature;
	
	
	static {
		chair_feature = "\n"
				 +"item\t\t\t\t\t\t" + "chair\n"
				 +"color\t\t\t\t\t\t"  + "white\n"
				 
				 +"model\t\t\t\t\t\t" + "old\n"; 
		
		bench_feature = "\n"
				 +"item\t\t\t\t\t\t" + "bench\n"
				 +"color\t\t\t\t\t\t" + "wood\n"
				 
				 +"model\t\t\t\t\t\t" + "six stand\n";  
		a_blanket_feature = "\n"
		 		+"item\t\t\t\t\t\t" + "Andhra_blanket\n"
		 		+"color\t\t\t\t\t\t"+ "red\n"
		 		+"model\t\t\t\t\t\t" + "2m*2m\n";
		r_blanket_feature = "\n"
 				+"item\t\t\t\t\t\t" + "Rajasthan_blanket\n"
 				+"color\t\t\t\t\t\t"+ "multiple colors\n"
 				+"model\t\t\t\t\t\t" + "2.5m*2.5m\n";
		c_carpet_feature = "\n"
				+"item\t\t\t\t\t\t" + "Color_carpets\n"
				+"color\t\t\t\t\t\t"+ "black and white\n"
				+"model\t\t\t\t\t\t" + "round\n";  
		p_carpet_feature = "\n"
				+"item\t\t\t\t\t\t" + "Plane_carpets\n"
				+"color\t\t\t\t\t\t" + "brown\n"
				+"model\t\t\t\t\t\t" + "square\n";  
		stove_feature = "\n"
				+"item\t\t\t\t\t\t" + "stove\n"
				+"color\t\t\t\t\t\t" + "steel\n"
				+"model\t\t\t\t\t\t" + "2-stove\n";  
		cylinder_feature = "\n"
				+"item\t\t\t\t\t\t" + "cylinder\n"
				+"color\t\t\t\t\t\t" + "red\n"
				+"model\t\t\t\t\t\t" + "14.5kg\n";  
	}
	
	// bills for section 1 home decorators
	public static String chairs_bill;
	public static String benches_bill;
	public static String Andhra_blanket_bill;
	public static String Rajasthan_blanket_bill;
	public static String Color_carpets_bill;
	public static String Plane_carpets_bill;
	public static String stove_bill;
	public static String cylinder_bill;
	
	
//	System.out.println(" ");
//	System.out.println("\t\t\t\t......RECEIPT......");
//	System.out.println("\t\t\t\tcost :      3000  ");
//	System.out.println("\t\t\t\tGST  :       100  ");
//	System.out.println("\t\t\t\t___________");
//	System.out.println("\t\t\t\tTOTAL :     3100");
//	}
	
	
	
	
	static {
		chairs_bill = "------------------------bill-----------------------\n"
					 +"item\t\t\t\t\t\t" + "chair\n"
					 
					 +"bill\t\t\t\t\t\t" + "100RS\n";  
		benches_bill = "------------------------bill-----------------------\n"
				 +"item\t\t\t\t\t\t" + "bench\n"
				 
				 +"bill\t\t\t\t\t\t" + "200RS\n";  
		Andhra_blanket_bill = "------------------------bill-----------------------\n"
				 		+"item\t\t\t\t\t\t" + "Andhra_blanket\n"
				 
				 		+"bill\t\t\t\t\t\t" + "500RS\n";
		Rajasthan_blanket_bill = "------------------------bill-----------------------\n"
		 				+"item\t\t\t\t\t\t" + "Rajasthan_blanket\n"
		 
		 				+"bill\t\t\t\t\t\t" + "600RS\n";
		Color_carpets_bill = "------------------------bill-----------------------\n"
 				+"item\t\t\t\t\t\t" + "Color_carpets\n"
 
 				+"bill\t\t\t\t\t\t" + "200RS\n";  
		Plane_carpets_bill = "------------------------bill-----------------------\n"
 				+"item\t\t\t\t\t\t" + "Plane_carpets\n"
 
 				+"bill\t\t\t\t\t\t" + "150RS\n";  
		stove_bill = "------------------------bill-----------------------\n"
 				+"item\t\t\t\t\t\t" + "stove\n"
 
 				+"bill\t\t\t\t\t\t" + "2000RS\n";  
		cylinder_bill = "------------------------bill-----------------------\n"
 				+"item\t\t\t\t\t\t" + "cylinder\n"
 
 				+"bill\t\t\t\t\t\t" + "1000RS\n";  
	}
	
	// items in section 2
	public static String items_in_sub_sec_1_in_sec_2;
	public static String items_in_sub_sec_2_in_sec_2;
	public static String items_in_sub_sec_3_in_sec_2;
	public static String items_in_sub_sec_4_in_sec_2;
	
	static {
		items_in_sub_sec_1_in_sec_2 = "1.vivo\n" + "2.oppo\n";
		items_in_sub_sec_2_in_sec_2 = "1.one plus ear phones\n" + "2.realme ear phones\n";
		items_in_sub_sec_3_in_sec_2 = "1.Lenovo lap\n" + "2.hp laptop\n";
		items_in_sub_sec_4_in_sec_2 = "1.nokia tab\n" + "2.samsung tab\n";
	}
	
	
	
	// featues of section 2
	public static String vivo_feature;
	public static String oppo_feature;
	public static String one_plus_ear_phone_feature;
	public static String realme_ear_phone_feature;
	public static String lenovo_lap_feature;
	public static String hp_laptop_feature;
	public static String nokia_tab_feature;
	public static String samsung_tab_feature;
	
	static {
		vivo_feature = "\n"
				 +"item\t\t\t\t\t\t" + "vivo\n"
				 +"color\t\t\t\t\t"  + "white\n"
				 
				 +"model\t\t\t\t\t\t" + "Y25\n";  
		oppo_feature = "\n"
			 +"item\t\t\t\t\t\t" + "oppo\n"
			 +"color\t\t\t\t\t\t" + "wood\n"
			 
			 +"model\t\t\t\t\t\t" + "F9\n";  
		one_plus_ear_phone_feature = "\n"
		 		+"item\t\t\t\t\t\t" + "one_plus_ear_phone\n"
		 		+"color\t\t\t\t\t\t"+ "red\n"
		 		+"model\t\t\t\t\t\t" + "NECK BAND\n";
		realme_ear_phone_feature = "\n"
 				+"item\t\t\t\t\t\t" + "realme_ear_phone\n"
 				+"color\t\t\t\t\t\t"+ "multiple colors\n"
 				+"model\t\t\t\t\t\t" + "Z24\n";
		lenovo_lap_feature = "\n"
				+"item\t\t\t\t\t\t" + "lenovo_lap\n"
				+"color\t\t\t\t\t\t"+ "grey\n"
				+"model\t\t\t\t\t\t" + "ideapad 5\n";  
		hp_laptop_feature =   "\n"
				+"item\t\t\t\t\t\t" + "hp_lap\n"
				+"color\t\t\t\t\t\t"+ "grey\n"
				+"model\t\t\t\t\t\t" + "ideapad 5\n";  
		nokia_tab_feature = "\n"
			+"item\t\t\t\t\t\t" + "nokia_tab_feature\n"
			+"color\t\t\t\t\t\t" + "steel\n"
			+"model\t\t\t\t\t\t" + "nokia pure\n";  
		samsung_tab_feature = "\n"
			+"item\t\t\t\t\t\t" + "samsung_tab_feature\n"
			+"color\t\t\t\t\t\t" + "black\n"
			+"model\t\t\t\t\t\t" + "S 14\n";  
	}
	
	
	
	// billing for section 2 items
	public static String vivo_bill;
	public static String oppo_bill;
	public static String one_plus_ear_phones_bill;
	public static String real_me_ear_phones_bill;
	public static String Lenovo_lap_bill;
	public static String hp_lap_bill;
	public static String nokia_tab_bill;
	public static String samsung_tab_bill;
	
	
	static {
		vivo_bill = "------------------------bill-----------------------\n"
					 +"item\t\t\t\t\t\t" + "vivo\n"
					 
					 +"bill\t\t\t\t\t\t" + "10000RS\n";  
		oppo_bill = "------------------------bill-----------------------\n"
				 +"item\t\t\t\t\t\t" + "oppo\n"
				 
				 +"bill\t\t\t\t\t\t" + "20000RS\n";  
		one_plus_ear_phones_bill = "------------------------bill-----------------------\n"
				 		+"item\t\t\t\t\t\t" + "one_plus_ear_phones\n"
				 
				 		+"bill\t\t\t\t\t\t" + "1000RS\n";
		real_me_ear_phones_bill = "------------------------bill-----------------------\n"
		 				+"item\t\t\t\t\t\t" + "real_me_ear_phones\n"
		 
		 				+"bill\t\t\t\t\t\t" + "600RS\n";
		Lenovo_lap_bill = "------------------------bill-----------------------\n"
 				+"item\t\t\t\t\t\t" + "Lenovo_lap\n"
 
 				+"bill\t\t\t\t\t\t" + "60000RS\n";  
		hp_lap_bill = "------------------------bill-----------------------\n"
 				+"item\t\t\t\t\t\t" + "hp_lap\n"
 
 				+"bill\t\t\t\t\t\t" + "45000RS\n";  
		nokia_tab_bill = "------------------------bill-----------------------\n"
 				+"item\t\t\t\t\t\t" + "nokia_tab\n"
 
 				+"bill\t\t\t\t\t\t" + "15000RS\n";  
		samsung_tab_bill = "------------------------bill-----------------------\n"
 				+"item\t\t\t\t\t\t" + "samsung_tab\n"
 
 				+"bill\t\t\t\t\t\t" + "10000RS\n";  
	}
	
	
	// items in section 3
	public static String items_in_sub_sec_1_in_sec_3;
	public static String items_in_sub_sec_2_in_sec_3;
	public static String items_in_sub_sec_3_in_sec_3;
	
	static {
		items_in_sub_sec_1_in_sec_3 = "1.shirts\n" + "2.pants\n";
		items_in_sub_sec_2_in_sec_3 = "1.panjabi\n" + "2.langa voni\n";
		items_in_sub_sec_3_in_sec_3 = "1.t-shirts\n" + "2.shots\n";
	}
	
	
	// features of section 3
	public static String shirts_feature;
	public static String pants_feature;
	public static String panjabi_feature;
	public static String langa_voni_feature;
	public static String t_shirts_feature;
	public static String shots_feature;
	
	static {
		shirts_feature = "\n"
				 +"item\t\t\t\t\t\t" + "shirts_feature\n"
				 +"color\t\t\t\t\t"  + "white\n"
				 
				 +"size\t\t\t\t\t\t" + "large\n";  
		pants_feature = "\n"
			 +"item\t\t\t\t\t\t" + "pants_feature\n"
			 +"color\t\t\t\t\t\t" + "blue\n"
			 +"size\t\t\t\t\t\t\t" + "36\n"
			 +"model\t\t\t\t\t\t" + "pencilcut\n";  
		panjabi_feature = "\n"
			 		+"item\t\t\t\t\t\t" + "panjabi_feature\n"
			 		+"color\t\t\t\t\t\t"+ "black\n";
		langa_voni_feature = "\n"
	 				+"item\t\t\t\t\t\t" + "langa_voni_feature\n"
	 				+"color\t\t\t\t\t\t"+ "red green\n";
		t_shirts_feature = "\n"
			+"item\t\t\t\t\t\t" + "t_shirts\n"
			+"color\t\t\t\t\t\t"+ "grey\n"
			+"size\t\t\t\t\t\t" + "small\n";  
		shots_feature = "\n"
			+"item\t\t\t\t\t\t" + "shots\n"
			+"color\t\t\t\t\t\t" + "white\n"
			+"size\t\t\t\t\t\t" + "22\n";    
	}
	
	// billing for section 3 items
		public static String shirts_bill;
		public static String pants_bill;
		public static String panjabi_bill;
		public static String langa_voni_bill;
		public static String t_shirts_bill;
		public static String shots_bill;
		
		
		static {
			shirts_bill = "------------------------bill-----------------------\n"
						 +"item\t\t\t\t\t\t" + "shirts\n"
						 
						 +"bill\t\t\t\t\t\t" + "1500RS\n";  
			pants_bill = "------------------------bill-----------------------\n"
					 +"item\t\t\t\t\t\t" + "pants\n"
					 
					 +"bill\t\t\t\t\t\t" + "2000RS\n";  
			panjabi_bill = "------------------------bill-----------------------\n"
					 		+"item\t\t\t\t\t\t" + "panjabi\n"
					 
					 		+"bill\t\t\t\t\t\t" + "1000RS\n";
			langa_voni_bill = "------------------------bill-----------------------\n"
			 				+"item\t\t\t\t\t\t" + "langa_voni\n"
			 
			 				+"bill\t\t\t\t\t\t" + "1500RS\n";
			t_shirts_bill = "------------------------bill-----------------------\n"
	 				+"item\t\t\t\t\t\t" + "t_shirts\n"
	 
	 				+"bill\t\t\t\t\t\t" + "600RS\n";  
			shots_bill = "------------------------bill-----------------------\n"
	 				+"item\t\t\t\t\t\t" + "shots\n"
	 
	 				+"bill\t\t\t\t\t\t" + "450RS\n";  
		}
		
	
	// items in section 4
	public static String items_in_sub_sec_1_in_sec_4;
	public static String items_in_sub_sec_2_in_sec_4;
	public static String items_in_sub_sec_3_in_sec_4;
	public static String items_in_sub_sec_4_in_sec_4;
	
	static {
		items_in_sub_sec_1_in_sec_4 = "1.apple\n" + "2.orange\n";
		items_in_sub_sec_2_in_sec_4 = "1.nestle serlac\n" + "2.castle serlac\n";
		items_in_sub_sec_3_in_sec_4 = "1.pine apple juice\n" + "2.grapes juice\n";
		items_in_sub_sec_4_in_sec_4 = "1.pesarapappu\n" + "2.kandhi pappu\n";
	}
	
	
	// features of section 4
	public static String apple_feature;
	public static String orange_feature;
	public static String nestle_serlac_feature;
	public static String castle_serlac_feature;
	public static String pine_apple_juice_feature;
	public static String grapes_juice_feature;
	public static String pesarapappu_feature;
	public static String kandhi_pappu_feature;
	
	
	static {
		apple_feature = "\n"
				 +"item\t\t\t\t\t\t" + "apple_feature\n"
				 +"quality\t\t\t\t\t"  + "4/5\n";  
		orange_feature = "\n"
			 +"item\t\t\t\t\t\t" + "orange_feature\n"
			 +"quality\t\t\t\t\t\t" + "4/5\n";  
		nestle_serlac_feature = "\n"
			 		+"item\t\t\t\t\t\t" + "nestle_serlac_feature\n"
			 		+"quality\t\t\t\t\t\t"+ "4/5\n";
		castle_serlac_feature = "\n"
	 				+"item\t\t\t\t\t\t" + "castle_serlac_feature\n"
	 				+"quality\t\t\t\t\t\t"+ "4/5\n";
		pine_apple_juice_feature = "\n"
			+"item\t\t\t\t\t\t" + "pine_apple_juice_feature\n"
			+"quality\t\t\t\t\t\t"+ "4/5\n";  
		grapes_juice_feature = "\n"
			+"item\t\t\t\t\t\t" + "grapes_juice_feature\n"
			+"quality\t\t\t\t\t\t" + "4/5\n";  
		pesarapappu_feature = "\n"
			+"item\t\t\t\t\t\t" + "pesarapappu_feature\n"
			+"quality\t\t\t\t\t\t" + "4/5\n";  
		kandhi_pappu_feature = "\n"
			+"item\t\t\t\t\t\t" + "kandhi_pappu_feature\n"
			+"quality\t\t\t\t\t\t" + "4/5\n";  
	}
	
	
	// billing for section 4 items
		public static String apples_bill;
		public static String orange_bill;
		public static String nestle_serlac_bill;
		public static String castle_serlac_bill;
		public static String pine_apple_juice_bill;
		public static String grapes_juice_bill;
		public static String pesarapappu_bill;
		public static String kandhi_pappu_bill;
		
		
		
		static {
			apples_bill = "------------------------bill-----------------------\n"
						 +"item\t\t\t\t\t\t" + "apples\n"
						 
						 +"bill\t\t\t\t\t\t" + "300RS\n";  
			orange_bill = "------------------------bill-----------------------\n"
					 +"item\t\t\t\t\t\t" + "orange\n"
					 
					 +"bill\t\t\t\t\t\t" + "200RS\n";  
			nestle_serlac_bill = "------------------------bill-----------------------\n"
					 		+"item\t\t\t\t\t\t" + "nestle_serlac\n"
					 
					 		+"bill\t\t\t\t\t\t" + "2000RS\n";
			castle_serlac_bill = "------------------------bill-----------------------\n"
			 				+"item\t\t\t\t\t\t" + "castle_serlac\n"
			 
			 				+"bill\t\t\t\t\t\t" + "2000RS\n";
			pine_apple_juice_bill = "------------------------bill-----------------------\n"
	 				+"item\t\t\t\t\t\t" + "pine_apple_juice\n"
	 
	 				+"bill\t\t\t\t\t\t" + "60RS\n";  
			grapes_juice_bill = "------------------------bill-----------------------\n"
	 				+"item\t\t\t\t\t\t" + "grapes_juice\n"
	 
	 				+"bill\t\t\t\t\t\t" + "45RS\n";  
			pesarapappu_bill = "------------------------bill-----------------------\n"
	 				+"item\t\t\t\t\t\t" + "pesarapappu\n"
	 
	 				+"bill\t\t\t\t\t\t" + "150RS\n";  
			kandhi_pappu_bill = "------------------------bill-----------------------\n"
	 				+"item\t\t\t\t\t\t" + "kandhi_pappu\n"
	 
	 				+"bill\t\t\t\t\t\t" + "170RS\n";  
		}
	
	// items in section 5
	public static String items_in_sub_sec_1_in_sec_5;
	public static String items_in_sub_sec_2_in_sec_5;
	public static String items_in_sub_sec_3_in_sec_5;
	
	static {
		items_in_sub_sec_1_in_sec_5 = "1.sleeve less t-shirts\n" + "2.sports shorts\n";
		items_in_sub_sec_2_in_sec_5 = "1.nike shoes\n" + "2.sports shoes\n";
		items_in_sub_sec_3_in_sec_5 = "1.bat\n" + "2.ball\n";
	}
	
	
	// features of section 5
	public static String sleeve_less_t_shirts_feature;
	public static String sports_shorts_feature;
	public static String nike_shoes_feature;
	public static String sports_shoes_feature;
	public static String bat_feature;
	public static String ball_feature;
	
	static {
		sleeve_less_t_shirts_feature = "\n"
		 		+"item\t\t\t\t\t\t" + "sleeve_less_t_shirts\n"
		 		+"color\t\t\t\t\t\t"+ "black\n";
		sports_shorts_feature = "\n"
 				+"item\t\t\t\t\t\t" + "sports_shorts\n"
 				+"color\t\t\t\t\t\t"+ "red green\n";
		nike_shoes_feature = "\n"
				+"item\t\t\t\t\t\t" + "nike_shoes\n"
				+"color\t\t\t\t\t\t"+ "grey\n"
				+"size\t\t\t\t\t\t" + "small\n";  
		sports_shoes_feature = "\n"
				+"item\t\t\t\t\t\t" + "sports_shoes\n"
				+"color\t\t\t\t\t\t" + "white\n"
				+"size\t\t\t\t\t\t" + "12\n";  
		bat_feature = "\n"
		 		+"item\t\t\t\t\t\t" + "bat\n"
		 		+"color\t\t\t\t\t\t"+ "wood\n";
		ball_feature = "\n"
 				+"item\t\t\t\t\t\t" + "ball\n"
 				+"color\t\t\t\t\t\t"+ "red, green\n";
	}
	
	
	// billing for section 5
	public static String sleeve_less_t_shirts_bill;
	public static String sports_shorts_bill;
	public static String nike_shoes_bill;
	public static String sports_shoes_bill;
	public static String bat_bill;
	public static String ball_bill;
	
	static {
		sleeve_less_t_shirts_bill = "------------------------bill-----------------------\n"
					 +"item\t\t\t\t\t\t" + "sleeve_less_t_shirts\n"
					 
					 +"bill\t\t\t\t\t\t" + "300RS\n";  
		sports_shorts_bill = "------------------------bill-----------------------\n"
				 +"item\t\t\t\t\t\t" + "sports_shorts\n"
				 
				 +"bill\t\t\t\t\t\t" + "300RS\n";  
		nike_shoes_bill = "------------------------bill-----------------------\n"
				 		+"item\t\t\t\t\t\t" + "nike_shoes\n"
				 
				 		+"bill\t\t\t\t\t\t" + "3000RS\n";
		sports_shoes_bill = "------------------------bill-----------------------\n"
		 				+"item\t\t\t\t\t\t" + "sports_shoes\n"
		 
		 				+"bill\t\t\t\t\t\t" + "2500RS\n";
		bat_bill = "------------------------bill-----------------------\n"
 				+"item\t\t\t\t\t\t" + "bat\n"
 
 				+"bill\t\t\t\t\t\t" + "4000RS\n";  
		ball_bill = "------------------------bill-----------------------\n"
 				+"item\t\t\t\t\t\t" + "ball\n"
 
 				+"bill\t\t\t\t\t\t" + "150RS\n";
	}

}
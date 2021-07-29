import java.io.*;
import java.util.*;
public class match
{
public static int agee;
public static String genn;
public static String n;
public static String b[]=new String[30];
public static String bt[]=new String[30];
public static int count=0;
//public static String u;
//public static String p;
public static void main(String args[])
{ //------------------------------------------------------------Home---------------------------------------------------------------------------------------  
 menu();
	}
		public static void cls()
         {
	           try
	              {	
		            new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
	              }
				catch(Exception e)
		             {
			           System.out.println(e);
		             }
          }
	

		private static void menu()
    {
		Scanner in=new Scanner(System.in);
		
		cls();
		while(true)
		{
			System.out.println("\t\t\t\t Welcome to Happy Club!!\n \t\t\t\t   1.Log In\n \t\t\t\t   2.Register\n \t\t\t\t   3.Exit");
		    String choice =in.next();
		
		    s:switch(choice)
		   {	case "1": login();
			    break;
			    case "2": register();
			    break;
			    case "3": System.exit(0);
			
			    default : System.out.println("Invalid Option selected. Try again");
			    break;
		   }
		}
	 }
private static void register()
{cls();
	//-------------------------------------------------------------------------Registration--------------------------------------------------------------------
{
try{
Scanner s= new Scanner(System.in);
System.out.println("Full Name:");
String n=s.nextLine();
System.out.print("User Name:");
String u=s.nextLine();
System.out.print("\nPassword:");
String p=s.nextLine();
FileOutputStream obj= new FileOutputStream(u+p+".txt");
System.out.println("Email Address:");
String em=s.nextLine();
System.out.println("City:");
String ci=s.nextLine();
while(true)
{
	Scanner in= new Scanner(System.in);
	System.out.println("Enter your birthday(dd mm yyyy):");
    int d=in.nextInt();
	int m=in.nextInt();
	int y=in.nextInt();
	if(y+18>2019)
	{System.out.println("You're are underage. Please make sure you're at least 18 years old.");
						}	 
	else
	{	int age=2019-y;
	System.out.println(" Great! You're "+age+" years old");
	agee=age;
	
	break;
						}
}

x:while(true)
{
System.out.println("\nGender\n 1.Male\n 2.Female\n 3.Other ");
String g=s.next();
switch(g)
{
	case "1":
		genn="Male";
		
		break x;
		
	case "2":
        genn="Female";
		
        break x;
    case "3":
		
        genn="Other";
        break x;
    default: 
        System.out.println("Invalit Input");	
	    break;
}
}

        File dir= new File("C:\\hc\\All user\\"+n+" "+genn);
        dir.mkdir();
		 File dir1= new File("C:\\hc\\All user\\"+n+" "+genn+"\\Hobby");
        dir1.mkdir();
		File dir2= new File("C:\\hc\\All user\\"+n+" "+genn+"\\heart");
        dir2.mkdir();
		File dir3= new File("C:\\hc\\All user\\"+n+" "+genn+"\\message");
        dir3.mkdir();
                            
		FileOutputStream obj1= new FileOutputStream("C:\\hc\\All user\\"+n+" "+genn+"\\"+n+".txt");
String c="Name:"+n;
byte b[]=c.getBytes();	
obj.write(b);
obj1.write(b);
String c1="\n"+genn;
byte b1[]=c1.getBytes();
obj.write(b1);
obj1.write(b1);
String c2="\nEmail Address:"+em;
byte b2[]=c2.getBytes();
obj.write(b2);
String c3="\nAge:"+agee;
byte b3[]=c3.getBytes();
obj.write(b3);
obj1.write(b3);
String c4="\nCity:"+ci;
byte b4[]=c4.getBytes();
obj.write(b4);
obj1.write(b4);
String xs="\nInterest:";
		byte bcc[]=xs.getBytes();
		obj.write(bcc);
		obj1.write(bcc);
xx:while(true)
{
	
System.out.println("Select your Intrests:\n \t1.Music.\n \t2.Sports.\n \t3.Travelling. \n \t4.Reading.\n \t5.Gaming. \n \t6.Science and technology. \n \t7.Cooking. \n \t8.Social media. \n \t9.Art. \n \t10.Dating.\n\n Press 0 to Save");
String in=s.next();
switch(in)
{
	case "1":
		in="Music";
		System.out.println("Music  Selected");
		String x0="\n\t\t"+in;
		byte bc[]=x0.getBytes();
		obj.write(bc);
		obj1.write(bc);
		FileOutputStream obj2= new FileOutputStream("C:\\hc\\All user\\"+n+" "+genn+"\\Hobby\\"+in+".txt");
		continue;
	case "2":
		in="Sports";
		String x1="\n\t\t"+in;
		byte bc1[]=x1.getBytes();
		obj.write(bc1);
		obj1.write(bc1);
		FileOutputStream obj3= new FileOutputStream("C:\\hc\\All user\\"+n+" "+genn+"\\Hobby\\"+in+".txt");
		System.out.println("Sports Selected");
		continue;
	case "3":
		in="Travelling";
		String x2="\n\t\t"+in;
		byte bc2[]=x2.getBytes();
		obj.write(bc2);
		obj1.write(bc2);
		FileOutputStream obj4= new FileOutputStream("C:\\hc\\All user\\"+n+" "+genn+"\\Hobby\\"+in+".txt");
		System.out.println("Travelling Selected");
		continue;
    case "4":
		in="Reading";
		String x3="\n\t\t"+in;
		byte bc3[]=x3.getBytes();
		obj.write(bc3);
		obj1.write(bc3);
		FileOutputStream obj5= new FileOutputStream("C:\\hc\\All user\\"+n+" "+genn+"\\Hobby\\"+in+".txt");
		System.out.println("Reading Selected");
		continue;
    case "5":
		in="Gaming";
		String x4="\n\t\t"+in;
		byte bc4[]=x4.getBytes();
		obj.write(bc4);
		obj1.write(bc4);
		FileOutputStream obj6= new FileOutputStream("C:\\hc\\All user\\"+n+" "+genn+"\\Hobby\\"+in+".txt");
		System.out.println("Gaming Selected");
		continue;
    case "6":
		in="Science and technology";
		String x5="\n\t\t"+in;
		byte bc5[]=x5.getBytes();
		obj.write(bc5);
		obj1.write(bc5);
		FileOutputStream obj7= new FileOutputStream("C:\\hc\\All user\\"+n+" "+genn+"\\Hobby\\"+in+".txt");
		System.out.println("Science and Technology Selected");
		break;
    case "7":
		in="Cooking";
		String x6="\n\t\t"+in;
		byte bc6[]=x6.getBytes();
		obj.write(bc6);
		obj1.write(bc6);
		FileOutputStream obj8= new FileOutputStream("C:\\hc\\All user\\"+n+" "+genn+"\\Hobby\\"+in+".txt");
		System.out.println("Cooking Selected");
		continue;
    case "8":
		in="Social Media";
		String x7="\n\t\t"+in;
		byte bc7[]=x7.getBytes();
		obj.write(bc7);
		obj1.write(bc7);
		FileOutputStream obj9= new FileOutputStream("C:\\hc\\All user\\"+n+" "+genn+"\\Hobby\\"+in+".txt");
		System.out.println("Social Media Selected");
		continue;
    case "9":
		in="Art";
		String x8="\n\t\t"+in;
		byte bc8[]=x8.getBytes();
		obj.write(bc8);
		obj1.write(bc8);
		FileOutputStream obj10= new FileOutputStream("C:\\hc\\All user\\"+n+" "+genn+"\\Hobby\\"+in+".txt");
		System.out.println("Art Selected");
		continue;
    case "10":
		in="Dating";
		String x9="\n\t\t"+in;
		byte bc9[]=x9.getBytes();
		obj.write(bc9);
		obj1.write(bc9);
FileOutputStream obj11= new FileOutputStream("C:\\hc\\All user\\"+n+" "+genn+"\\Hobby\\"+in+".txt");
		System.out.println("Dating Selected");
		continue;
    case "0":
		break xx;		
		
	
    default: 
        System.out.println("Invalit Input");	
	    break xx;
}
}


obj.close();cls();
System.out.println("---------------------------- Registration Successful ----------------------------"+"\n---------------------------- Login to continue ----------------------------");
}
catch(Exception e)
{
	System.out.println("Can not leave Empty");
}

}
}
//------------------------------------------------------Log in--------------------------------------------------------
private static void login()
{
	cls();
while(true)
{
Scanner s= new Scanner(System.in);
System.out.print("User Name:");
String u=s.nextLine();
System.out.print("\nPassword:");
String p=s.nextLine();
try
			{
				FileInputStream obj=new FileInputStream(u+p+".txt");
				log(u,p);
				
			}
catch(Exception e)
			{
			System.out.println("Invalid or Incorrect Username or Password.Try again");
			}
}
}
private static void log(String u, String p)
{   cls();
	System.out.println("----------------------------You'r Logged In----------------------------");
			 
	while(true)
    {
	System.out.println("\t\t\t 1.Profile\n \t\t\t 2.Search for match \n \t\t\t 3.Hearts \n \t\t\t 4.Message \n\t\t\t 5.Logout\n\t\t\t");
	Scanner s= new Scanner(System.in);
	String open=s.next();
    switch(open)
	{
		case "1": profile(u,p);
		                 break;
		case "2": search(u,p);
                 break;
		case "3": heart(u,p);
                  break;
		case "4": message(u,p);
                 break;
		case "5": logout();
                 break;
        default: System.out.println("Invalid Input");
                 break;		
	}
    }
}
private static void profile(String u,String p)
{	cls();
System.out.println("---------------------------- ABOUT YOU ----------------------------");

try
{
FileInputStream obj=new FileInputStream(u+p+".txt");
int a=0;
while((a=obj.read())!=-1)
{
System.out.print((char)a);
}
System.out.println("\n");
obj.close();
}
catch(Exception e)
{
	System.out.println(e);
}
}
//-------------------------------------------------Search for match -----------------------------------------------------------
private static void search(String u,String p)
{  
try{
			
			File f1=new File(u+p+".txt");
			BufferedReader br=new BufferedReader(new FileReader(u+p+".txt"));
			BufferedReader bp=new BufferedReader(new FileReader(u+p+".txt"));
			String rm=bp.readLine();				
		    rm=rm.replace("Name:","");
			rm=rm.trim();
			String pm=bp.readLine();
			pm=pm.trim();
			String qq=rm+" "+pm;
			File fil =new File("C:\\hc\\All user\\"+rm+" "+pm+"\\Hobby");
			
			String[] dd=fil.list(new FilenameFilter(){
				public boolean accept(File current,String name){
					return name.endsWith(".txt");
				}
			});
			int nn=dd.length;
			for(int i=0;i<nn;i++){
				if(dd[i]==null)
				{continue;
				}
				dd[i]=dd[i].replaceAll(".txt","").trim();
			}
			
			
			String s;
			String r;
			int o=1,ui=1;
			File file =new File("C:\\hc\\All user");
			String[] d=file.list(new FilenameFilter(){
				public boolean accept(File current,String name){
					return new File(current,name).isDirectory();
				}
			});
			int n=d.length;
			while((s=br.readLine())!=null)
			{
			if(s.contains("Female"))
			{ 
			for(int i=0;i<n;i++)
			{	count =0;
				bt[i+1]=d[i];
				d[i]=d[i].replaceAll(" Male","");
				d[i]=d[i].replaceAll(" Female","");
				d[i]=d[i].replaceAll(" Other","");
				b[i+1]=d[i];
				d[i]=d[i].toUpperCase();
				if(bt[i+1].contains(" Male")){
				
				File fi =new File("C:\\hc\\All user\\"+bt[i+1]+"\\Hobby");
				String[] ddd=fi.list(new FilenameFilter(){
				public boolean accept(File current,String name){
					return name.endsWith(".txt");
				}
				});
				int nnn=ddd.length;
				for(int ii=0;ii<nnn;ii++){
					ddd[ii]=ddd[ii].replaceAll(".txt","").trim();
					for(int j=0;j<nn;j++){
						if(ddd[ii].equals(dd[j])){
								
							count=count+10;
					}
						}
					}
				
				
				
				
				System.out.println("\n\t"+(o++)+"."+d[i]+" -- "+count+"% Match");
				bt[ui]=b[i+1];
				ui++;
				}
			}
			ri:while(true){cls();
			System.out.println("\nSelect to view Profile! or press 0 to go back");
			Scanner in=new Scanner(System.in);
			int a=in.nextInt();
			if(a==0)
			{ 
		log(u,p);
			}
			for(int i=1;i<30;i++)
			{
				if(a==i)
				{
				
				BufferedReader bo=new BufferedReader(new FileReader("C:\\hc\\All user\\"+bt[i]+" Male\\"+bt[i]+".txt"));
				while((r=bo.readLine())!=null)
				{System.out.println(r);
				}
				 System.out.println("1.Send Heart 2.Back");
			     String q=in.next();
				 switch(q)
				 {case "1":
				 FileOutputStream ob1= new FileOutputStream("C:\\hc\\All user\\"+bt[i]+" Male\\heart\\"+qq+".txt");
				 cls();
				 System.out.println("---------------------------- Your Heart Is Sent Successfully ----------------------------");
				 System.out.println("Press(y) To continue!");
				 in.next();
				 break;
				 case "2": search(u,p);
			
		        } break ri;
				}
			
			}
			}
			}
			
			else if(s.contains("Male"))
			{
			for(int i=0;i<n;i++)
			{	count=0;
				bt[i+1]=d[i];
				d[i]=d[i].replaceAll(" Male","");
				d[i]=d[i].replaceAll(" Female","");
				d[i]=d[i].replaceAll(" Other","");
				b[i+1]=d[i];
				d[i]=d[i].toUpperCase();
				if(bt[i+1].contains(" Female")){
				
				File fi =new File("C:\\hc\\All user\\"+bt[i+1]+"\\Hobby");
				String[] ddd=fi.list(new FilenameFilter(){
				public boolean accept(File current,String name){
					return name.endsWith(".txt");
				}
				});
				int nnn=ddd.length;
				for(int ii=0;ii<nnn;ii++){
					ddd[ii]=ddd[ii].replaceAll(".txt","").trim();
					for(int j=0;j<nn;j++){
						if(ddd[ii].equals(dd[j])){
								
							count=count+10;
					}
						}
					}
				
				
				System.out.println("\n\t"+(o++)+"."+d[i]+" -- "+count+"% Match");
				bt[ui]=b[i+1];
				ui++;
				}
			}
			ri:while(true){
			System.out.println("\nEnter the serial to check out their profile or press 0 to go back");
			Scanner in=new Scanner(System.in);
			int a=in.nextInt();
			if(a==0)
			{ 
		     log(u,p);
			}
			for(int i=1;i<30;i++)
			{   cls();
				if(a==i)
				{
				
				BufferedReader bo=new BufferedReader(new FileReader("C:\\hc\\All user\\"+bt[i]+" Female\\"+bt[i]+".txt"));
				while((r=bo.readLine())!=null)
				{System.out.println(r);
				}System.out.println("1.Send Heart 2.Back");
			     String q=in.next();
				 cls();
				 switch(q)
				 {
				 case "1": 
				 
				 
				         FileOutputStream ob1= new FileOutputStream("C:\\hc\\All user\\"+bt[i]+" Female\\heart\\"+qq+".txt");
				          cls();
				 System.out.println("---------------------------- Your Heart Is Sent Successfully ----------------------------");
				 System.out.println("Press(y) To continue!");
				 in.next(); 
				           
				 break;
				 case "2": search(u,p);
			
		        } break ri;
				}
				
			
			}
			
			}
			}
			else
			{continue;}
			
		}
		
		}
		catch(Exception e)
		{System.out.println(e);
		}	
}
//---------------------------------------------------------------------------------------Heart--------------------------------------------------------------------------------------------------------
public static void heart(String u,String p)
{
try
{
			File f1=new File(u+p+".txt");
			BufferedReader bp=new BufferedReader(new FileReader(u+p+".txt"));
			String rm=bp.readLine();				
		    rm=rm.replace("Name:","");
			rm=rm.trim();
			String pm=bp.readLine();
			pm=pm.trim();
			String qq=rm+" "+pm;
			File fil =new File("C:\\hc\\All user\\"+rm+" "+pm+"\\heart");
			
			String[] dd=fil.list(new FilenameFilter(){
				public boolean accept(File current,String name){
					return name.endsWith(".txt");
				}
			});
			int n=dd.length;
			String na[]=new String[n+1];
			String ng[]=new String[n+1];
			cls();
			System.out.println("---------------------------- Hearts From ----------------------------");
			for(int i=0;i<n;i++){
				if(dd[i]==null)
				{continue;
				}
				dd[i]=dd[i].replaceAll(".txt","").trim();
				na[i+1]=dd[i];
				dd[i]=dd[i].replaceAll("Male","").replaceAll("Female","").trim();
				System.out.println(" "+(i+1)+"."+dd[i]);
				ng[i+1]=dd[i];
			}
	
			System.out.println("\n Select the number for options! Or press 0 to go back");
			Scanner in=new Scanner(System.in);
			int a=in.nextInt();
			if(a==0)
			{ 
		log(u,p);
			}
		for(int i=1;i<30;i++)
			{
			
				if(a==i)
				{
					xxx:while(true)
					{
						System.out.println("\n=========Select Your Options========= \n 1.View Profile \n 2.Accept \n 3.Reject \n 4.Go back");
				    int x=in.nextInt();
						
                   switch(x)
					 {
					case 1: 
					      String r;
						 
						   System.out.println("---------------------------- About ----------------------------"); 
					    BufferedReader bo=new BufferedReader(new FileReader("C:\\hc\\All user\\"+na[i]+"\\"+ng[i]+".txt"));
				        while((r=bo.readLine())!=null)
				       {  
						   System.out.println(r);
				        }
						break;
					case 2: 
					        try
							{
								 File file = new File("C:\\hc\\All user\\"+qq+"\\heart\\"+na[i]+".txt");
					             if(file.delete())
								 {  
							 
    	                            System.out.println("---------------------------- Heart Accepted ----------------------------");
							     }
								
							}       
							catch(Exception e)
							{
								System.out.println(e);
							}
							
							String o1="";
                             File fild =new File("C:\\hc");
			                String[] dk=fild.list(new FilenameFilter(){
				            public boolean accept(File current,String name){
					        return name.endsWith(".txt");
				                 }
			                     });
								 int y=dk.length;
								 for(int j=0;j<y;j++)
								 { 
								String r1;	 
						      	BufferedReader bos=new BufferedReader(new FileReader("C:\\hc\\"+dk[j]));
								
				                while((r1=bos.readLine())!=null){
								if(r1.contains(ng[i]))
								{
									o1=dk[j].replaceAll(".txt","").trim();
								}
							    }
								 }
							FileOutputStream obj= new FileOutputStream("C:\\hc\\All user\\"+qq+"\\message\\"+ng[i]+".txt");
							FileOutputStream obj1= new FileOutputStream("C:\\hc\\All user\\"+na[i]+"\\message\\"+rm+".txt");
						    FileOutputStream obj2= new FileOutputStream("C:\\hc\\Message\\"+u+p+" "+rm+" "+ng[i]+" "+o1+".txt");
							
							break;
							

					
					case 3:  
					       try
							{File file = new File("C:\\hc\\All user\\"+qq+"\\heart\\"+na[i]+".txt");
					        if(file.delete()){
								cls();
    	                    System.out.println("---------------------------- Heart Rejected ----------------------------");
							}

							}
							catch(Exception e)
							{
								System.out.println(e);
								
							}
							break;
			
					case 4:
					       
					       break xxx;
						   
					 }
					 
						
					}
					
					
			}
}
}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
//---------------------------------------------------------Message---------------------------
private static void message(String u,String p)
{cls();
	try{    File f1=new File(u+p+".txt");
			BufferedReader bp=new BufferedReader(new FileReader(u+p+".txt"));
			String rm=bp.readLine();				
		    rm=rm.replace("Name:","");
			rm=rm.trim();
			String pm=bp.readLine();
			pm=pm.trim();
			String qq=rm+" "+pm;
			File fil =new File("C:\\hc\\All user\\"+qq+"\\message");
			String[] dk=fil.list(new FilenameFilter(){
				            public boolean accept(File current,String name){
					        return name.endsWith(".txt");
				                 }
			                     });
			int n=dk.length;
	     
			{for(int i=0;i<n;i++){
				if(dk[i]==null)
				{continue;
				}
				dk[i]=dk[i].replaceAll(".txt","").trim();
				System.out.println(" "+(i+1)+"."+dk[i]);
			File filx =new File("C:\\hc\\Message");
			String[] dl=filx.list(new FilenameFilter(){
				            public boolean accept(File current,String name){
					        return name.endsWith(".txt");
				                 }
			                     });
								 
			}
			File filx =new File("C:\\hc\\Message");
			String[] dj=filx.list(new FilenameFilter(){
				            public boolean accept(File current,String name){
					        return name.endsWith(".txt");
				                 }
			                     });
			System.out.println("\n Select To Start Conversation! Or press 0 to go back");
			Scanner in=new Scanner(System.in);
			int ii=in.nextInt();
			if(ii==0)
			{ 
		log(u,p);
			}
			if(ii>dj.length)
			{
				System.out.print("Invalid option!!!!");
				message(u,p);
			}
		for(int i=1;i<dj.length+1;i++)
			{
			
			if(ii==i)
				{for(int j=0;j<dj.length;j++){	
			if(dj[j].contains((u+p)) && dj[j].contains(dk[ii-1])){
		     while(true)
						
			{
			try{
			BufferedReader d1=new BufferedReader(new FileReader("C:\\hc\\Message\\"+dj[j]));
			String r1;
			while((r1=d1.readLine())!=null)
			{  
				  System.out.println(r1);
		    }
			System.out.println("Enter your message:                                                           Press 0 to go back");	
			FileOutputStream obj= new FileOutputStream(("C:\\hc\\Message\\"+dj[j]),true);
			Scanner s=new Scanner(System.in);
			String pic=s.nextLine();
			String pi="\n"+rm+":"+pic;
			
			if(pic.equals("0"))
			{
			 message(u,p);	
			}
			else
			{byte b[]=pi.getBytes();	
            obj.write(b);
			obj.close();
			}
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			}
			}
					
			}
				}
			
			else
			{
				continue;
			}
                				
				
			}
			}
			
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
	
private static void logout()
{
	menu();
}
}
import java.io.*;
class hms
{
    int xyz=0,e[]=new int[100000],p=-1,w=-1;
    String dprtmnt[]=new String[6],ab[],menu[]=new String[5],room[]=new String[5],med[]=new String[6],nod[]=new String[12],nod1[]=new String[100000];//to store the nemes of rooms, medical facilities, doctors, departments and the menu
    String name[]=new String[100000],ad[]=new String[100000],admby[]=new String[100000],date[]=new String[100000],atndat[]=new String[100000],atndon[]=new String[100000],nameofdoc,gender[]=new String[100000];
    int age[]=new int[100000],opt[]=new int[100000],dch[]=new int[100000],rch[]=new int[100000],mch[]=new int[100000],f[]=new int[100000],ticket[]=new int[100000],billno[]=new int[100000];
    int count1=0,count2=0,count3=0,count4=0,id[]=new int[100000];//to store how many times each option is selected
    double total1=0,total2=0,total3=0,total4=0,bill[]=new double[100000];//to store how much has each service earned
    long phno[]=new long[100000],phnog[]=new long[100000];
    double firno,chd[]=new double[6],chr[]=new double[5],chm[]=new double[6],medi,extra=0.0,extch[]=new double[100000],tch;//to generate fir number, ticket number, charge of rooms, departments, medicine, medical assistance, ticket, and extra charges
    BufferedReader ob=new BufferedReader(new InputStreamReader(System.in));
    char pa[]=new char[100000],ma[]=new char[100000],roomused[]=new char[100000],gp[]=new char[100000],m[]=new char[100000],dt[]=new char[100000],po[]=new char[100000];
    private void homescreen()throws IOException
    {
        System.out.println("\n\n\n\t\t**********************************************************************************************************");
        for(long i=0;i<=100000000;i++){}
        System.out.println("\t\t**********************************************************************************************************");
        for(long i=0;i<=100000000;i++){}
        System.out.println("\t\t**\t\t\t\t------______WELCOME TO THE MEDICITY______------                         **");
        for(long i=0;i<=100000000;i++){}
        System.out.println("\t\t**\t\t\t\t\t\t\t\t\t\t\t\t\t**");
        for(long i=0;i<=100000000;i++){}
        System.out.println("\t\t**\t\t\t\t\t\t\t\t\t\t\t\t\t**");
        for(long i=0;i<=100000000;i++){}
        System.out.print("\t\t**\t\"R");
        for(long i=0;i<=100000000;i++){}
        System.out.print("e");
        for(long i=0;i<=100000000;i++){}
        System.out.print("a");
        for(long i=0;i<=100000000;i++){}
        System.out.print("l");
        for(long i=0;i<=100000000;i++){}
        System.out.print("i");
        for(long i=0;i<=100000000;i++){}
        System.out.print("s");
        for(long i=0;i<=100000000;i++){}
        System.out.print("i");
        for(long i=0;i<=100000000;i++){}
        System.out.print("n");
        for(long i=0;i<=100000000;i++){}
        System.out.print("g\t\t\t\t\t\t\t\t\t\t\t**");
        for(long i=0;i<=100000000;i++){}
        for(long i=0;i<=100000000;i++){}
        System.out.print("\n\t\t**\t\t    O");
        for(long i=0;i<=100000000;i++){}
        System.out.print("u");
        for(long i=0;i<=100000000;i++){}
        System.out.print("r\t\t\t\t\t\t\t\t\t\t\t**");
        for(long i=0;i<=100000000;i++){}
        for(long i=0;i<=100000000;i++){}
        System.out.print("\n\t\t**\t\t\t D");
        for(long i=0;i<=100000000;i++){}
        System.out.print("r");
        for(long i=0;i<=100000000;i++){}
        System.out.print("e");
        for(long i=0;i<=100000000;i++){}
        System.out.print("a");
        for(long i=0;i<=100000000;i++){}
        System.out.print("m\t\t\t\t\t\t\t\t\t\t**");
        for(long i=0;i<=100000000;i++){}
        for(long i=0;i<=100000000;i++){}
        System.out.print("\n\t\t**\t\t\t\t  O");
        for(long i=0;i<=100000000;i++){}
        System.out.print("f\t\t\t\t\t\t\t\t\t**");
        for(long i=0;i<=100000000;i++){}
        for(long i=0;i<=100000000;i++){}
        System.out.print("\n\t\t**\t\t\t\t\tA\t\t\t\t\t\t\t\t**");
        for(long i=0;i<=100000000;i++){}
        for(long i=0;i<=100000000;i++){}
        System.out.print("\n\t\t**\t\t\t\t\t\tH");
        for(long i=0;i<=100000000;i++){}
        System.out.print("e");
        for(long i=0;i<=100000000;i++){}
        System.out.print("a");
        for(long i=0;i<=100000000;i++){}
        System.out.print("l");
        for(long i=0;i<=100000000;i++){}
        System.out.print("t");
        for(long i=0;i<=100000000;i++){}
        System.out.print("h");
        for(long i=0;i<=100000000;i++){}
        System.out.print("i");
        for(long i=0;i<=100000000;i++){}
        System.out.print("e");
        for(long i=0;i<=100000000;i++){}
        System.out.print("r\t\t\t\t\t\t**");
        for(long i=0;i<=100000000;i++){}
        for(long i=0;i<=100000000;i++){}
        System.out.print("\n\t\t**\t\t\t\t\t\t\t     A");
        for(long i=0;i<=100000000;i++){}
        System.out.print("n");
        for(long i=0;i<=100000000;i++){}
        System.out.print("d\t\t\t\t\t**");
        for(long i=0;i<=100000000;i++){}
        for(long i=0;i<=100000000;i++){}
        System.out.print("\n\t\t**\t\t\t\t\t\t\t\t   S");
        for(long i=0;i<=100000000;i++){}
        System.out.print("a");
        for(long i=0;i<=100000000;i++){}
        System.out.print("f");
        for(long i=0;i<=100000000;i++){}
        System.out.print("e");
        for(long i=0;i<=100000000;i++){}
        System.out.print("r\t\t\t\t**");
        for(long i=0;i<=100000000;i++){}
        for(long i=0;i<=100000000;i++){}
        System.out.print("\n\t\t**\t\t\t\t\t\t\t\t\t   W");
        for(long i=0;i<=100000000;i++){}
        System.out.print("o");
        for(long i=0;i<=100000000;i++){}
        System.out.print("r");
        for(long i=0;i<=100000000;i++){}
        System.out.print("l");
        for(long i=0;i<=100000000;i++){}
        System.out.print("d");
        for(long i=0;i<=100000000;i++){}
        System.out.println("\"\t\t\t**");
        for(long i=0;i<=100000000;i++){}
        for(long i=0;i<=100000000;i++){}
        System.out.println("\t\t**********************************************************************************************************");
        for(long i=0;i<=100000000;i++){}
        System.out.println("\t\t**********************************************************************************************************");
        for(long i=0;i<=100000000;i++){}
        for(long i=0;i<=100000000;i++){}
        System.out.println("\n\n\nEnter 1 to start serving people: ");
        String a=ob.readLine();
    }
    private void menu() throws IOException     //function to display the menu
    {
        String m[]={"Emergency Service","OPD Service","In Patient Service","On Call Facility","Admin"};
        menu=m;
        System.out.println("\f");
        System.out.println("\t\t\t********************************************************************************************");
        System.out.println("\t\t\t********************************************************************************************");
        System.out.println("\t\t\t**                   ------________ THE MEDICITY: ________------                          **");
        System.out.println("\t\t\t**                           ~~~~~~~~~~~~~~~~~~~~~~~~~~~                                  **");
        System.out.println("\t\t\t**                                                                                        **");
        System.out.println("\t\t\t**      >>Select the service you need:                                                    **");
        System.out.println("\t\t\t**                               1. Emergency Service                                     **");
        System.out.println("\t\t\t**                               2. OPD Service                                           **");
        System.out.println("\t\t\t**                               3. In Patient Service                                    **");
        System.out.println("\t\t\t**                               4. On call facility                                      **");
        System.out.println("\t\t\t**                               5. Administrator                                         **");
        System.out.println("\t\t\t**                               6. EXIT                                                  **");
        System.out.println("\t\t\t********************************************************************************************");
        System.out.println("\t\t\t********************************************************************************************");
        System.out.print("\nEnter your choice:--> ");
        int a=Integer.parseInt(ob.readLine());
        opt[w+1]=a;  //opt stores the user's choice for use in other functions
        System.out.println();
        switch (a)
        {
            case 1: w++;
                    emergencyservice();
                    count1++;
                    xyz++;
                    break;
            case 2: w++;
                    opd();
                    count2++;
                    xyz++;
                    break;
            case 3: w++;
                    inpatientservice();
                    count3++;
                    xyz++;
                    break;
            case 4: w++;
                    oncallfacility();
                    count4++;
                    xyz++;
                    break;
            case 5: admin();
                    xyz++;
                    break;
            case 6: exit();
                    break;
            default: System.out.println("\t\t*----Wrong Choice!----*");
                     System.out.print("\t\tProgram will restart again");
                     for(long i=0;i<=100000000;i++)
                     {}
                     for(long i=0;i<=100;i++){}
                     System.out.print(" .");
                     for(long i=0;i<=100000000;i++)
                     {}
                     for(long i=0;i<=1000;i++){}
                     System.out.print(" .");
                     for(long i=0;i<=100000000;i++)
                     {}
                     for(long i=0;i<=10000;i++){}
                     System.out.print(" .");
                     main();
                     break;
        }
    }
    private void input()throws IOException    //function to store the details of patient
    {
        System.out.println("\f");
        System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t              ________________PATIENT DETAILS________________");
        System.out.println("\n> Enter the details of the patient:");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.print("\tName of the patient:>                   ");
        name[w]=ob.readLine();
        System.out.print("\tAddress of patient:>                    ");
        ad[w]=ob.readLine();
        if(opt[w]==1)
        {
            System.out.print("\tGuardian responsible for patient:>      ");
            admby[w]=ob.readLine();
            System.out.print("\tPhone number of guardian:>              ");
            phnog[w]=Long.parseLong(ob.readLine());
        }
        System.out.print("\tAge of patient:>                        ");
        age[w]=Integer.parseInt(ob.readLine());
        System.out.print("\tGender of patient:>                     ");
        gender[w]=ob.readLine();
        System.out.print("\tPhone number of patient:>               ");
        phno[w]=Long.parseLong(ob.readLine());
        System.out.println("\n Press enter to continue: ");
        String x=ob.readLine();
    }
    private void emergencyservice()throws IOException     //function called in case of emergency service
    {
        input();
        checkpolice();
    }
    private void checkpolice()throws IOException  //function to check for police case
    {
        System.out.println("\f");
        System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t          ________________POLICE CASE VERIFICATION________________");
        System.out.println("\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\n\t))Is this a police case?(Y/N)");
        System.out.print("\t");
        String a=ob.readLine();
        a=a.toLowerCase();
        char b=a.charAt(0);
        if(b=='y')
        {
            fir();
            po[w]='y';
        }
        else
        {
            emergencycase();
        }
    }
    private void fir()throws IOException
    {
        firno=Math.random();  //to generate F.I.R number
        firno=firno*100000;
        int fi=(int) firno; //to store F.I.R number
        f[w]=fi;
        System.out.println("______________________________________________________________________________________________");
        System.out.print("\nPlease wait while F.I.R number is generated");
        for(long i=0;i<=100000000;i++){}
        for(long i=0;i<=100000000;i++){}
        System.out.print(" .");
        for(long i=0;i<=100000000;i++){}
        for(long i=0;i<=100000000;i++){}
        System.out.print(" .");
        for(long i=0;i<=100000000;i++){}
        for(long i=0;i<=100000000;i++){}
        System.out.println(" .");
        for(long i=0;i<=100000000;i++){}
        for(long i=0;i<=100000000;i++){}
        System.out.println("\n\t\t# The F.I.R number is :       "+fi);
        System.out.print("\t\t# Enter the date of incident: ");
        date[w]=ob.readLine();
        System.out.println("\n\n\n\n\n\n\n\nPress enter to continue:");
        String x=ob.readLine();
        System.out.println("\f");
        emergencycase();
    }
    private void emergencycase()throws IOException //function to carry out all functions of emergency service
    {
        System.out.println("\f");
        generalphysician();
        System.out.println("\f");
        medicalassistance();
        System.out.println("\f");
        System.out.println("\t))Is the patient to be admitted?(Y/N)");
        System.out.print("\t");
        String ch=ob.readLine();
        ch=ch.toLowerCase();
        char d=ch.charAt(0);
        pa[w]=d;
        System.out.println();
        if(d=='y')
        {
            System.out.println("\f");
            rooms();
            System.out.println();
            roomused[w]='y';
        }
        System.out.println("\f");
        System.out.println("\tWhich department is to be consulted?");
        System.out.println();
        departments();
        System.out.println();
        medicine();
    }
    private void generalphysician()throws IOException // function that refers to general physician
    {
        nameofdoc="Dr. Sumit Prasad";
        System.out.println("< You will be attended by - "+nameofdoc+" - appointed as the general physician. >");
        System.out.println();
        docdetails();
        gp[w]='y';
    }
    private void docdetails()throws IOException //to store the details of the checkup by general physician
    {
        System.out.print("\t[> Attended on: ");
        atndon[w]=ob.readLine();
        System.out.print("\t[> Attended at: ");
        atndat[w]=ob.readLine();
    }
    private void departments()throws IOException
    {
        String d[]={"Neurology","Cardiology","Urology","General Physician","Dermatology","E.N.T"};
        dprtmnt=d;
        double a[]={1000.0,900.0,800.0,600.0,700.0,500.0};
        chd=a;
        String doctor[]={"Dr. Mukul Roy","Dr. Shushant Singh","Dr. Manik Das","Dr. Gaurav Dey","Dr. Amit Prasad","Dr. Suraj Mehta","Dr. Mahesh Gupta","Dr. Aakash Bhattacharya","Dr. Parvendar Rana","Dr. Ramesh Pal","Dr. Roshan Mallik","Dr. Koushik Chand"}; 
        nod=doctor;
        if(w%2==0)
        {
            System.out.println("\t\t1. "+d[0]+";            Attending doctor: "+nod[0]+";        Charge: Rs. "+chd[0]);
            System.out.println("\t\t2. "+d[1]+";           Attending doctor: "+nod[1]+";   Charge: Rs. "+chd[1]);
            System.out.println("\t\t3. "+d[2]+";              Attending doctor: "+nod[2]+";        Charge: Rs. "+chd[2]);
            System.out.println("\t\t4. "+d[3]+";    Attending doctor: "+nod[3]+";       Charge: Rs. "+chd[3]);
            System.out.println("\t\t5. "+d[4]+";          Attending doctor: "+nod[4]+";      Charge: Rs. "+chd[4]);
            System.out.println("\t\t6. "+d[5]+";                Attending doctor: "+nod[5]+";      Charge: Rs. "+chd[5]);
            System.out.println();
        }
        else
        {
            System.out.println("\t\t1. "+d[0]+";            Attending doctor: "+nod[6]+";        Charge: Rs. "+chd[0]);
            System.out.println("\t\t2. "+d[1]+";           Attending doctor: "+nod[7]+";   Charge: Rs. "+chd[1]);
            System.out.println("\t\t3. "+d[2]+";              Attending doctor: "+nod[8]+";        Charge: Rs. "+chd[2]);
            System.out.println("\t\t4. "+d[3]+";    Attending doctor: "+nod[9]+";       Charge: Rs. "+chd[3]);
            System.out.println("\t\t5. "+d[4]+";          Attending doctor: "+nod[10]+";      Charge: Rs. "+chd[4]);
            System.out.println("\t\t6. "+d[5]+";                Attending doctor: "+nod[11]+";      Charge: Rs. "+chd[5]);
            System.out.println();
        }
        System.out.print("Enter your choice:=-> ");
        dch[w]=Integer.parseInt(ob.readLine());
        if ((dch[w]>=1&&dch[w]<=6)==false)
        {
            System.out.println("\f");
            System.out.println("            ----Wrong choice!----");
            System.out.println("Choose the department from the following options:");
            departments();
        }
                if(w%2==0)
        {
            nod1[w]=nod[dch[w]-1];
        }
        else
        {
            nod1[w]=nod[dch[w]+5];
        }
        dt[w]='y';
    }
    private void rooms()throws IOException
    {
            String r[]={"A.C. Deluxe Cabin","A.C. Standard Cabin","Non A.C. Deluxe Cabin","Non A.C. Standard Cabin","General Cabin"};
            room=r;
            double c[]={1500.0,1000.0,800.0,700.0,500.0};
            chr=c;
            System.out.println("\tChoose the room you require:");
            System.out.println();
            System.out.println("\t\t1. "+room[0]+";          Charge: Rs. "+chr[0]);
            System.out.println("\t\t2. "+room[1]+";        Charge: Rs. "+chr[1]);
            System.out.println("\t\t3. "+room[2]+";      Charge: Rs. "+chr[2]);
            System.out.println("\t\t4. "+room[3]+";    Charge: Rs. "+chr[3]);
            System.out.println("\t\t5. "+room[4]+";              Charge: Rs. "+chr[4]);
            System.out.println();
            System.out.print("Enter your choice:=-> ");
            int a=Integer.parseInt(ob.readLine());
            rch[w]=a;
            if((rch[w]>=1&&rch[w]<=5)==false)
            {
                System.out.println("\f");
                System.out.println("\n\n            ----Wrong Choice!----");
                System.out.println("          >>You need to choose again:");
                System.out.println();
                rooms();
            }
            roomused[w]='y';
    }
    private void medicalassistance()throws IOException
    {
        String m[]={"I.C.U","Oxygen","C.T. Scan","Ultrasonography","X-Ray","Blood Supply","Saline"};
        med=m;
        double c[]={1000.0,400.0,900.0,800.0,500.0,300.0,600.0};
        chm=c;
        System.out.println("\t))Do you need medical assistance?(Y/N)");
        System.out.print("\t");
        String a=ob.readLine();
        a=a.toLowerCase();
        char bi=a.charAt(0);
        ma[w]=bi;
        if(bi=='y')
        {
            System.out.println("\f");
            System.out.println("\t>Choose the kind of medical assistance required:");
            System.out.println("\t-------------------------------------------------");
            mediassis();
        }
    }
    private void mediassis()throws IOException
    {
        System.out.println();
        System.out.println("\t\t1. "+med[0]+";            Charge: Rs. "+chm[0]);
        System.out.println("\t\t2. "+med[1]+";           Charge: Rs. "+chm[1]);
        System.out.println("\t\t3. "+med[2]+";        Charge: Rs. "+chm[2]);
        System.out.println("\t\t4. "+med[3]+";  Charge: Rs. "+chm[3]);
        System.out.println("\t\t5. "+med[4]+";            Charge: Rs. "+chm[4]);
        System.out.println("\t\t6. "+med[5]+";     Charge: Rs. "+chm[5]);
        System.out.println();
        System.out.print("Enter your choice:=-> ");
        int b=Integer.parseInt(ob.readLine());
        mch[w]=b;
        if((mch[w]>=1&&mch[w]<=6)==false)
        {
            System.out.println("\f");
            System.out.println("\n\n            ----Wrong choice!----");
            System.out.println("           You need to choose again!");
            System.out.println();
            mediassis();
        }
    }
    private void medicine()throws IOException
    {
        System.out.println("\f");
        System.out.println("\t))Is medicine to be purchased from hospital?(Y/N)");
        System.out.print("\t");
        String a=ob.readLine();
        a=a.toLowerCase();
        a=a.trim();
        char b=a.charAt(0);
        System.out.println();
        m[w]=b;
        if(b=='y')
        {
            if(opt[w]==1)
            {
                System.out.println("***For Emergency Service, you need to pay a fixed medicine charge of Rs. 500 daily.***");
                medi=500;
            }
            else if(opt[w]==3)
            {
                System.out.println("***For In Patient Service, you need to pay a fixed medicine charge of Rs. 400 daily.***");
                medi=400;
            }
            System.out.println();
        }
    }
    private void tickets()throws IOException
    {
        double t=Math.random();
        t=t*100;
        int ti=(int)t;
        System.out.print("Please wait while your ticket is booked");
        for(long i=0;i<=100000000;i++){}
        System.out.print(" .");
        for(long i=0;i<=100000000;i++){}
        System.out.print(" .");
        for(long i=0;i<=100000000;i++){}
        System.out.println(" .");
        for(long i=0;i<=100000000;i++){}
        for(long i=0;i<=1000000;i++){}
        System.out.println("\f");
        System.out.println(">>Your ticket has been booked. It is ticket number: "+ti);
        ticket[w]=ti;
        tch=100.0;
        System.out.println(">>Your ticket charge is: Rs. "+tch);
        System.out.println("\n Press enter to continue: ");
        String x=ob.readLine();
    }
    private void opd() throws IOException
    {
        input();
        System.out.println("\f");
        System.out.println("Press 1 to book a ticket: ");
        String x=ob.readLine();
        tickets();
        System.out.println("\f");
        System.out.println("\t))Which department has to be visited?");
        departments();
        roomused[w]='n';
        pa[w]='n';
        gp[w]='n';
    }
    private void inpatientservice()throws IOException
    {
        input();
        System.out.println("\f");
        generalphysician();
        System.out.println("\f");
        System.out.println("\t))Which department has been referred by the general physician?");
        departments();
        System.out.println("\f");
        medicalassistance();
        System.out.println("\f");
        rooms();
        System.out.println("\f");
        medicine();
        roomused[w]='y';
        pa[w]='y';
    }
    private void oncallfacility()throws IOException
    {
        input();
        System.out.println("\f");
        System.out.println("Press 1 to book a ticket: ");
        String x=ob.readLine();
        tickets();
        System.out.println("\f");
        System.out.println("\t))Choose the department you have to visit: ");
        departments();
    }
    private void bill()throws IOException
    {
        bill[w]=0;
        e[w]=1;
        int abcd=0;
        billno[w]=w+1;
        double ptid=Math.random();
        ptid=ptid*100000;
        id[w]=(int)ptid;
        if(opt[w]==1||opt[w]==3)
        {
            System.out.print(">> Enter the extra/miscellaneous charges(if any, otherwise, enter 0): ");
            extra=Double.parseDouble(ob.readLine());
            extch[w]=extra;
        }
        System.out.println();
        if(opt[w]==1||opt[w]==3)
        {
            if(roomused[w]=='y'&&pa[w]=='y')
            {
                System.out.print(">> Enter the number of days stayed: ");
                e[w]=Integer.parseInt(ob.readLine());
                System.out.println();
                abcd=1;
            }
        }
        if(opt[w]==2||opt[w]==4)
        {
            docdetails();
        }
        System.out.println("\f");
        System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t\t\t\t\t\t\t\t   ______________THE MEDICITY______________");
        System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t\t\t BILL NO.:-> "+billno[w]+"                                                                     Patient ID:-> "+id[w]);
        System.out.println();
        System.out.println("\t\t\t\t\t>Name of patient:                       "+name[w]);
        System.out.println("\t\t\t\t\t>Address of patient:                    "+ad[w]);
        if(opt[w]==1)
        {
         System.out.println("\t\t\t\t\t>Guardian responsible for patient:      "+admby[w]);
         System.out.println("\t\t\t\t\t>Phone number of guardian:              "+phnog[w]);
        }
        System.out.println("\t\t\t\t\t>Age of patient:                        "+age[w]+" years");
        System.out.println("\t\t\t\t\t>Gender of patient:                     "+gender[w]);
        System.out.println("\t\t\t\t\t>Phone number of patient:               "+phno[w]);
        System.out.println();
        System.out.println("\t\t\t\t\t   >>>Type of service:=->         "+menu[opt[w]-1]);
        if(opt[w]==1)
        {
            if(po[w]=='y')
            {
                System.out.println();
                System.out.println("\t\t\t\t\t\t**Police Case Involved.**");
                System.out.println("\t\t\t\t# F.I.R No.: "+f[w]+"              "+"Date of F.I.R filing: "+date[w]);
            }
        }
        if(gp[w]=='y')
        {
            System.out.println();
            System.out.print("\t\t\t\t>>Examining General Physician: "+nameofdoc+"     ");
            System.out.print("[>Attended on: "+atndon[w]+"      ");
            System.out.println("[>Attended at: "+atndat[w]);
        }
        if(opt[w]==2||opt[w]==4)
        {
            System.out.print("\t\t\t\t[>Attended on: "+atndon[w]+"      ");
            System.out.println("[>Attended at: "+atndat[w]);
        }
        if(dt[w]=='y')
        {
            System.out.println();
            System.out.println("\t\t\t\t>>>Department referred:              "+dprtmnt[dch[w]-1]);
            System.out.println("\t\t\t\t|| Presiding doctor of department:   "+nod1[w]);
            System.out.println("\t\t\t\t>> Charge of department:             Rs. "+chd[dch[w]-1]);
            bill[w]=bill[w]+chd[dch[w]-1];
        }
        if(opt[w]==2||opt[w]==4)
        {
            System.out.println();
            System.out.println("\t\t\t\t|#| Ticket number: "+ticket[w]+"\t\t\t"+"Ticket Charge: Rs. "+tch);
            bill[w]=bill[w]+tch;
        }
        if (ma[w]=='y')
        {
            System.out.println();
            System.out.print("\t\t\t\t>Medical facility used:=-> "+med[mch[w]-1]);
            System.out.println("\t>> Charge of facility:> Rs. "+chm[mch[w]-1]);
            bill[w]=bill[w]+chm[mch[w]-1];
        }
        if(opt[w]==1||opt[w]==3)
        {
            if(roomused[w]=='y')
            {
                System.out.println();
                System.out.print("\t\t\t\t>Room used:=-> "+room[rch[w]-1]);
                System.out.println("\t>> Charge of room: Rs. "+chr[rch[w]-1]);
                bill[w]=bill[w]+chr[rch[w]-1];
            }
        }  
        if(m[w]=='y'&&(opt[w]==1||opt[w]==3))
        {
            System.out.println();
            System.out.println("\t\t\t\t>> Cost fo medicine: Rs. "+medi+" per day.");
            bill[w]=bill[w]+medi;
        }
        if(abcd==1)
        {
            bill[w]=bill[w]*e[w];
        }
        if(opt[w]==1||opt[w]==3)
        {
            if(roomused[w]=='y')
            {
                System.out.println();
                System.out.println("\t\t\t\t[> No. of days stayed:> "+e[w]);
            }
        }
        if(opt[w]==1||opt[w]==3)
        {
            System.out.println();
            System.out.println("\t\t\t\t>> Extra Charges:> Rs. "+extch[w]);
            bill[w]=bill[w]+extch[w];
            extra=0;
        }
        System.out.println("\t\t\t\t-------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t[>> The total bill is: Rs. "+bill[w]);
        if(opt[w]==1)
        {
            total1=total1+bill[w];
        }
        else if(opt[w]==2)
        {
            total2=total2+bill[w];
        }
        else if(opt[w]==3)
        {
            total3=total3+bill[w];
        }
        else if(opt[w]==4)
        {
            total4=total4+bill[w];
        }
    }
    private void admin()throws IOException
    {
        System.out.println("\f");
        System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\t\t\t\t                ________________ADMINISTRATOR________________");
        System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("\n\t\t\t\t\t1) Today, till now, there have been "+count1+" emergency cases.");
        System.out.println("\n\t\t\t\t\t>> Emergency service has earned   Rs. "+total1+" so far.");
        System.out.println("\n\t\t\t\t2) Today, till now, there have been "+count2+" O.P.D cases.");
        System.out.println("\n\t\t\t\t\t>> O.P.D Service has earned       Rs. "+total2+" so far.");
        System.out.println("\n\t\t\t\t3) Today, till now, there have been "+count3+" In patient service cases.");
        System.out.println("\n\t\t\t\t\t>> In Patient Service has earned  Rs. "+total3+" so far.");
        System.out.println("\n\t\t\t\t4) Today, till now, there have been "+count4+" calls on On Call Facility.");
        System.out.println("\n\t\t\t\t\t>> On Call Facility has earned    Rs. "+total4+" so far");
        System.out.println("\t\t\t\t---------------------------------------------------");
        System.out.println("\t\t\t\t\t>>GRAND TOTAL:                    Rs. "+(total1+total2+total3+total4));
        choice();
    }
    private void choice()throws IOException
    {
        System.out.println("\n\nEnter 1 to search the details of the patient ");
        System.out.println("Enter 2 to go to main menu.");
        System.out.println("Enter 3 to exit.");
        System.out.print("\nEnter your choice: ");
        int v=Integer.parseInt(ob.readLine());
        if(v==1)
        {
            patient_details_store();
        }
        else if(v==2)
        {
            menu();
        }
        else if(v==3)
        {
            exit();
        }
        else
        {
            System.out.println("\n\n\n          _______Wrong Choice!_______");
            System.out.println("          >>You need to choose again:");
            choice();
        }
    }        
    void main()throws IOException
    {
        if(w==-1)
        {
            homescreen();
        }
        menu();
        if(opt[xyz]!=5)
        {
            bill();
        }
        System.out.println();
        System.out.println("\t))Do you want to return to main menu?(Y/N)");
        System.out.println("\t");
        String a=ob.readLine();
        a=a.toLowerCase();
        char b=a.charAt(0);
        if(b=='y')
        {
            System.out.println("\f");
            main();
        }
        else
        {
            exit();
        }
    }
    private void patient_details_store() throws IOException
    {
        System.out.println("\f\n\n\n\t\t\t\tEnter 1 to search by name.");
        System.out.println("\t\t\t\tEnter 2 to search by patient ID.");
        System.out.print("\n\t\tEnter your choice: ");
        int v=Integer.parseInt(ob.readLine());
        if(v==1)
        {
            System.out.println("\n\nEnter the name: ");
            searchbyname();
        }
        else if(v==2)
        {
            System.out.println("\n\nEnter the ID of the patient: ");
            searchbyid();
        }
        else 
        {
            System.out.println("\n\n\t           _______Wrong choice!_______");
            System.out.println("\t           >>You need to choose again:");
            patient_details_store();
        }
        if((p!=-1)&&((v==1)||(v==2)))
        {
            System.out.println("\f");
            System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t\t\t\t\t\t\t\t\t        THE MEDICITY              ");
            System.out.println("\t\t\t\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("\t\t\t\t BILL NO.:-> "+billno[p]+"                                                           Patient ID:- "+id[p]);
            System.out.println();
            System.out.println("\t\t\t\t\t>Name of patient:                       "+name[p]);
            System.out.println("\t\t\t\t\t>Address of patient:                    "+ad[p]);
            if(opt[p]==1)
            {
                System.out.println("\t\t\t\t\t>Guardian responsible for patient:      "+admby[p]);
                System.out.println("\t\t\t\t\t>Phone number of guardian:              "+phnog[p]);
            }
            System.out.println("\t\t\t\t\t>Age of patient:                        "+age[p]+" years");
            System.out.println("\t\t\t\t\t>Gender of patient:                     "+gender[p]);
            System.out.println("\t\t\t\t\t>Phone number of patient:               "+phno[p]);
            System.out.println();
            System.out.println("\t\t\t\t\t   >>>Type of service:=->         "+menu[opt[p]-1]);
            if(opt[p]==1)
            {
                if(po[p]=='y')
                {
                    System.out.println();
                    System.out.println("\t\t\t\t\t\t**Police Case Involved.**");
                    System.out.println("\t\t\t\t# F.I.R No.: "+f[p]+"              "+"Date of F.I.R filing: "+date[p]);
                }
            }
            if(gp[p]=='y')
            {
                System.out.println();
                System.out.print("\t\t\t\t>>Examining General Physician: "+nameofdoc+"     ");
                System.out.print("[>Attended on: "+atndon[p]+"      ");
                System.out.println("[>Attended at: "+atndat[p]);
            }
            if(dt[p]=='y')
            {
                System.out.println();
                System.out.println("\t\t\t\t>>>Department referred:              "+dprtmnt[dch[p]-1]);
                System.out.println("\t\t\t\t|| Presiding doctor of department:   "+nod1[p]);
                System.out.println("\t\t\t\t>> Charge of department:             Rs. "+chd[dch[p]-1]);
            }
            if(opt[p]==2||opt[p]==4)
            {
                System.out.println();
                System.out.println("\t\t\t\t|#| Ticket number: "+ticket[p]+"\t\t\t"+"Ticket Charge: Rs. "+tch);
            }
            if (ma[p]=='y')
            {
                System.out.println();
                System.out.print("\t\t\t\t>Medical facility used:=-> "+med[mch[p]-1]);
                System.out.println("\t\t\t\t\t>> Charge of facility:> Rs. "+chm[mch[p]-1]);
            }
            if(opt[p]==1||opt[p]==3)
            {
                if(roomused[p]=='y')
                {
                    System.out.println();
                    System.out.print("\t\t\t\t>Room used:=-> "+room[rch[p]-1]);
                    System.out.println("\t\t\t\t\t>> Charge of room: Rs. "+chr[rch[p]-1]);
                }
            }    
            if(m[p]=='y'&&(opt[p]==1||opt[p]==3))
            {
                System.out.println();
                System.out.println("\t\t\t\t>> Cost fo medicine: Rs. "+medi+" per day.");
            }
            if(opt[p]==1||opt[p]==3)
            {
                if(roomused[p]=='y')
                {
                    System.out.println();
                    System.out.println("\t\t\t\t[> No. of days stayed:> "+e[p]);
                }
            }
            if(opt[p]==1||opt[p]==3)
            {
                System.out.println();
                System.out.println("\t\t\t\t>> Extra Charges:> Rs. "+extch[p]);
            }
            System.out.println("\t\t\t\t-------------------------------------------------------------------------------------------------------------------");
            System.out.println("\t\t\t\t[>> The total bill is: Rs. "+bill[p]);
        }
        pds();
    }
    private void pds()throws IOException
    {
        System.out.println("\n\n\t\t\tEnter 1 to return to admin menu.");
        System.out.println("\t\t\tEnter 2 to return to main menu.");
        System.out.println("\t\t\tEnter 3 to exit.");
        int ap=Integer.parseInt(ob.readLine());
        switch(ap)
        {
            case 1: admin();
                    break;
            case 2: menu();
                    break;
            case 3: exit();
                    break;
            default: System.out.println("\n\n\t            ________WRONG CHOICE________");
                     System.out.println("\t            >>You need to choose again:");
                     System.out.println("\n");
                     pds();
                     break;
        }
    }
    private void searchbyname()throws IOException
    {
        String c=ob.readLine();
        c=c.toLowerCase();
        char v=c.charAt(0);
        if(v!='n')
        {
            for(int i=0;i<=w;i++)
            {
                if(name[i].equalsIgnoreCase(c))
                {
                    p=i;
                    break;
                }
                else
                {
                    p=-1;
                }
            }
            if(p==-1)
            {
                System.out.println("Name not found!");
                System.out.print("Re-enter the name: (or enter n to return to admin)");
                searchbyname();
            }
        }
        else if(v=='n')
        {
            admin();
        }
    }
    private void searchbyid()throws IOException
    {
        int v=Integer.parseInt(ob.readLine());
        if(v!=0)
        {          
            for(int i=0;i<=xyz;i++)
            {
                if(v==id[i])
                {
                    p=i;
                    break;
                }
                else
                {
                    p=-1;
                }
            }
            if(p==-1)
            {
                System.out.println("ID not found!");
                System.out.println("Re-enter ID: (or enter 0 to return to admin)");
                searchbyid();
            }
        }
        else if(v==0)
        {
            admin();
        }
    }
    private void exit()throws IOException
    {
        System.out.println("\f");
        System.out.println("\t\t\t+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\t\t\t++                               ____________________                                      ++");
        System.out.println("\t\t\t++                      *****-----     THANK YOU!     -----****                            ++");
        System.out.println("\t\t\t++                               ~~~~~~~~~~~~~~~~~~~~                                      ++");
        System.out.println("\t\t\t+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("\n\n\n\t\t\tSt. Mary's High School \n\t\t\t Computer Project");
        System.out.println("\n\n\n\t\t\t\tPRESENTED BY:->>");
        System.out.println("\t\t\t\t-------------------");
        System.out.println("\t\t\t1)Bishnu Tiwari\t\t4)Shabnam Ara Khatun\n\t\t\t2)Karan Agarwal\t\t5)Esha Shokeen\n\t\t\t3)Arnab Upadhaya\t6)Gayatri Devi Barman");
        System.exit(0);
    }
}

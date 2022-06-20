 System.out.println("Date before rolling = "+ge.getTime());
        ge.roll(Calendar.DATE,false);           
        ge.roll(Calendar.MONTH,true);       //If true then roll up the value by 1.
        ge.roll(Calendar.YEAR,true);        //If false then roll down the value by 1.
        System.out.println("Date after the rollig = "+ge.getTime());
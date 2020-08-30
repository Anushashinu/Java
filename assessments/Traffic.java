package com.assessments;

public enum Traffic {

RED(1),
GREEN(2),
YELLOW(3);

 private int duration = 0;

 Traffic(int duration) {
this.duration = duration;
}

 public int getDuration() {
return this.duration;
}

public static void main(String[] args)
{
for(Traffic light: Traffic.values())
{
System.out.println("The traffic light value is: " +light);
System.out.println("The duration of that trafic light value is: " + light.getDuration());
}
}

}

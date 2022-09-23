int const trigPin = 2;
int const echoPin = 3;
int const ledPin = 13;
int const buzzPin =12;
void setup() 
{
 
  pinMode(ledPin, OUTPUT);
  pinMode(trigPin, OUTPUT);
  pinMode(echoPin, INPUT); 
  pinMode(buzzPin,OUTPUT);
  
}

void loop()
{   
  { 
    int duration, distance;
	digitalWrite(trigPin, HIGH);
    delay(1);
	digitalWrite(trigPin, LOW);
	duration = pulseIn(echoPin, HIGH);
	distance = (duration/2) / 29.1;
    
    if (distance <= 50 && distance >= 0) 
    {
    	digitalWrite(ledPin, HIGH);
    } 
    else
    {
    	digitalWrite(ledPin, LOW);
    }
    delay(60);
  }
  {
   double a=analogRead(A0);
    double t=(((a/1024)*5)-0.5)*100;
    Serial.print("hello da");
    Serial.println(t);
    if(t>32)
      digitalWrite(12,1);
    else
      digitalWrite(12,0);
    delay(1000);
  }
}
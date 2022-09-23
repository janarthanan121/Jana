int const trigPin = 3;
int const echoPin = 4;
int const buzzPin = 12;
void setup()
{
  {
  Serial.begin(9600);
  pinMode(13,OUTPUT);
  pinMode(2,INPUT);
}
{
  pinMode(trigPin, OUTPUT);
  pinMode(echoPin, INPUT); 
  pinMode(buzzPin, OUTPUT);
  }
}

void loop()
{
  {
    
  digitalWrite(13,LOW);
  int a =digitalRead(2);
  if(a==1){
    Serial.println("Mention detected!!");
    digitalWrite(13,HIGH);
  }
  delay(1000);

  }
  { 
    int duration, distance;
	digitalWrite(trigPin, HIGH);
    delay(1);
	digitalWrite(trigPin, LOW);
	duration = pulseIn(echoPin, HIGH);
	distance = (duration/2) / 29.1;
    
    if (distance <= 50 && distance >= 0) 
    {
    	digitalWrite(buzzPin, HIGH);
    } 
    else
    {
    	digitalWrite(buzzPin, LOW);
    }
    delay(60);
   }
  }
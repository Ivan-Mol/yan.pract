package Sprint3.Tezla;

class Tezla extends Automobile {
    protected double autoPilotMaxSpeed;
    protected double autoPilotAcceleration;

    public Tezla() {
        autoPilotMaxSpeed = 60;
        autoPilotAcceleration = 11;
    }

    public void accelerateByAutopilot() {
        if (speed+autoPilotAcceleration>autoPilotMaxSpeed) {
            speed = autoPilotMaxSpeed;
        }
        else {
            speed += autoPilotAcceleration;
        }
    }

    @Override
    public void accelerate() {

            if (speed+acceleration>maxSpeed){
                speed = maxSpeed;
            }
            else {
                speed += acceleration;
            }

    }

    @Override
    public void brake() {

            if (speed-brakingSpeed<0){
                speed = 0;
            }
            else {
                speed = speed-brakingSpeed;
            }
    }
// переопределите метод для ускорения

    // переопределите метод для торможения
}
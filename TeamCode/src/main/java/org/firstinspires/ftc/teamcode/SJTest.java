package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;

@TeleOp(name = "R1")
public class SJTest extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {
        //initialization code goes here
        DcMotor motorOneFL = hardwareMap.get(DcMotor.class,"motor_one");
        waitForStart();
        DcMotor motorTwoBL = hardwareMap.get(DcMotor.class,"motor_two");
        waitForStart();
        DcMotor motorThreeFR = hardwareMap.get(DcMotor.class,"motor_three");
        waitForStart();
        DcMotor motorFourBR = hardwareMap.get(DcMotor.class,"motor_four");
        waitForStart();

        while(opModeIsActive()){
            double speed = gamepad1.left_stick_x;
            motorOneFL.setPower(speed);
            motorTwoBL.setPower(speed);
            motorThreeFR.setPower(speed);
            motorFourBR.setPower(speed);


        }
    }
}

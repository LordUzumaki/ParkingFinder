# Project One: Parking Finder

* Author: Alemu, Teddy
* Class: CPSC121 Section 001
* Semester: Spring 2022

## Overview
Parking Finder is a program that find closest parking spot to my car poition. Basiclly used the
existing class "edu.cwi.parking.parkingspot" that was provided in the class and created a class "ParkingFinder.java which
helped set a string for the rest of the code. 


## Discussion

	I was having problems with Total cost for Spots. when i put in parking time 45,
	the numbers of total cost did not print out properly. The spots and distance to 
	spots printed the way i wanted to. I tried doing web search, but i didnt not get 
	enough help from that, so i did some research to get me started with my project and
	help from my professor. The error i got was not getting the proper out put value for 
	total cost, but i fixed that by  adding Math.ceil((double) parkingTime / to all spots(spotOne or two or three...).INTERVAL) * 
	spotOne.getCostPerInterval(); printed out proper output value for total cost. I would be able to 
	apply this project or what i learn in the future projects. This project opened my eye 
	that i need to do more practice, so it will be much easier in the future. 
	
## Testing

I have tested the project or code alot to make sure everything worked properly. It should 
not have any issues with the program, if you plug in Numbers 2232 in the Random SEED and then plugin in 
21 in parking time (minutes) to find the nearest parking spot. It should give the right amount of cost to each spot and distance to the initial start 
of the car.

## Sources Used
website: https://lmsevigny.github.io/CPSC-121/ParkingSpot/edu/cwi/parking/ParkingSpot.html#setAvailable(boolean)
Textbook: Java Foundations


----------
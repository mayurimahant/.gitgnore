Name             :-Mayuri Mahant
CollegeName      :-GNIT , NAGPUR
Year Of Passing  :-2022
Mb No.           :-8600058053
Email Id         :-mayurimahant789@gmail.com




1)
using System;

namespace ConsoleApp1
{
    class Program
    {
        public class Planet
        {
            // properties
            public string Name;
            public double Surface_gasses;
            public double Number_of_Moons;
            public double Rings;

            // constructor of Planet
            public Planet(string name, double suface_gasses, double no_of_moons, double rings)
            {
                Name = name;
                Surface_Gasses = suface_gasses;
                Number_of_Moons = no_of_moons;
                Rings = rings;
            }

            // Output data about planet to console
            public void Display()
            {
                Console.WriteLine("Planet: Name = {0}, Surface_Gasses = {0}, Number_of_Moons = {0}, Rings = {0}", Name, Surface_gasses, Number_of_Moons, Rings);
            }
        }
        static void Main(string[] args)
        {
            // Make objects
            Planet earth = new Planet("Earth", O2, 1, No); ;
            Planet Mars = new Planet("Mars", CO2, 2, No);
            


            // Display data
            earth.Display();
            Mars.Display();
        }
    }
}

OR

2)
class planet:
    def __init__(self, name, surface_gasses, number_of_moons, rings):
        self.name = name
        self.surface_gasses = surface_gasses
        self.number_of_moons = number_of_moons
        self.rings = rings



p1 = planet("Mercury", 0, 0, "No")
p2 = planet("Venus", "Carbon Dioxide, Nitrogen", 0, "No")
p3 = planet("Earth", "Nitrogen, Oxygen", 1, "No")
p4 = planet("Jupiter", "Hydrogen, Helium", 79, "Yes")
p5 = planet("Saturn", "Hydrogen, Helium", 83, "Yes")
p6 = planet("Uranus", "Hydrogen, Helium, Methane", 27, "Yes")
Planets=[p1,p2,p3,p4,p5,p6]
count1=0

def count_moons(self):
  for i in Planets:
      if self.rings=="Yes":
        count1=Self.number_of_moons++;
        print(count1);

count_moons();


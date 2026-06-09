class SuperHero:
    """
    A class to represent a superhero.

    Attributes:
        name (str): The superhero's name
        power (str): The superhero's main superpower
        health (int): The superhero's health points
    """

    def __init__(self, name: str, power: str, health: int):
        # TODO: Initialize the superhero's attributes here
        self.name=name
        self.power=power
        self.health=health


# TODO: Create Superhero instances
sh1 = SuperHero("Batman", "Intelligence", 100)
sh2 = SuperHero("Superman", "Strength", 150)



# TODO: Print out the attributes of each superhero
print(sh1.name)
print(sh1.power)
print(sh1.health)
print(sh2.name)
print(sh2.power)
print(sh2.health)
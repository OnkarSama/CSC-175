# Purpose: Blueprint and Driver Basketball stats
# Authors: Onkar Dhillon and Shafat Syed
# Version: V1
# Date: 1/24/2023

class basketballStats:

    # Constructor initializes an object/instance of Spaceship by initializing all attributes.
    def __init__(self, height, threePointPercentage, fieldGoalPercentage, theName ):
        # Initialize attributes.
        self.height = height
        self.threePointPercentage = threePointPercentage
        self.fieldGoalPercentage = fieldGoalPercentage
        self.name = theName

    def __str__(self):
        result = ("Player Name: " + self.name + " is (" + str(self.height) + " inches tall and has a three point percentage of, " + str(self.threePointPercentage) + "% \n" + " His field goal percentage is " + self.fieldGoalPercentage + ".\n")
        return result

        # Accessor for captain.
    def getName(self):
        return self.name

        # Mutator for captain.
    def setName(self, theName="unknown"):
        if theName != "":
            self.name = theName

    def getHeight(self):
        return self.height

        # Mutator for captain.
    def setHeight(self, theHeight = 0):
        self.height = theHeight

    def getThreePointPercentage(self):
        return self.threePointPercentage

        # Mutator for captain.
    def setThreePointPercentage(self, threePointPercentage = 0):

        self.threePointPercentage = threePointPercentage

    def getFieldGoalPercentage(self):
        return self.fieldGoalPercentage

        # Mutator for captain.
    def setFieldGoalPercentage(self, fieldGoalPercentage = 0):

        self.fieldGoalPercentage = fieldGoalPercentage



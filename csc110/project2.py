#Rodas Gebreyohannes, 7/8/2024, calculates how much food a baker needs based on # of costumers
costumerNum = int(input("How many people many to be served? "))
batchNumUnround = costumerNum / 12
batchNum = int(batchNumUnround + 0.99) 

cocoa_Recipe_Amount = 106 #Define amount of ingredients for one recipe as variables
salt_Recipe_Amount = 6
bake_Recipe_Amount = 5
espresso_Recipe_Amount = 2
sugar_Recipe_Amount = 447
flour_Recipe_Amount = 180
chip_Recipe_Amount = 340
butter_Recipe_Amount = 0.5
vanilla_Recipe_Amount = 1
egg_Recipe_Amount = 4

cocoa_Total_Amount = cocoa_Recipe_Amount * batchNum #(x ingredient) total is still in the recipe's units 
salt_Total_Amount = salt_Recipe_Amount * batchNum 
bake_Total_Amount = bake_Recipe_Amount * batchNum
espresso_Total_Amount = espresso_Recipe_Amount * batchNum
sugar_Total_Amount = sugar_Recipe_Amount * batchNum
flour_Total_Amount = flour_Recipe_Amount * batchNum
chip_Total_Amount = chip_Recipe_Amount * batchNum
butter_Total_Amount = butter_Recipe_Amount * batchNum
vanilla_Total_Amount = vanilla_Recipe_Amount * batchNum
egg_Total_Amount = egg_Recipe_Amount * batchNum

cocoa_Required_Containers = cocoa_Total_Amount / (8 * 28.3495231) #convert units used in the recipe to units used in the containers 
salt_Required_Containers = salt_Total_Amount / (26 * 28.3495231)
bake_Required_Containers = bake_Total_Amount / (8.1 * 28.3495231)
espresso_Required_Containers = espresso_Total_Amount / (7.05 * 28.3495231)
sugar_Required_Containers = sugar_Total_Amount / (28.3495231 * 16 * 4)
flour_Required_Containers = flour_Total_Amount / (28.3495231 * 16 * 4)
chip_Required_Containers = chip_Total_Amount / (12 * 28.3495231)
butter_Required_Containers = butter_Total_Amount / 1 #same units don't need unit conversation but they need container conversation 
vanilla_Required_Containers = (vanilla_Total_Amount * 3 /48 * 8) /2
egg_Required_Containers = egg_Total_Amount / 18 #same units don't need unit conversation but they need container conversation

cocoa_Required_Containers= cocoa_Required_Containers + 0.999999999999999  #These lines will round up the leftover container needed 
salt_Required_Containers = salt_Required_Containers + 0.99999999999999999
bake_Required_Containers = bake_Required_Containers + 0.9999999999999999
espresso_Required_Containers = espresso_Required_Containers + 0.9999999999999
sugar_Required_Containers= sugar_Required_Containers + 0.99999999999999
flour_Required_Containers = flour_Required_Containers + 0.99999999999999
chip_Required_Containers = chip_Required_Containers  + 0.9999999999999999
butter_Required_Containers = butter_Required_Containers + 0.9999999999999 
vanilla_Required_Containers = vanilla_Required_Containers + 0.999999999999
egg_Required_Containers = egg_Required_Containers + 0.999999999999999 

copow = int(cocoa_Required_Containers) #These lines will 
salt = int(salt_Required_Containers)
bakpow = int(bake_Required_Containers)
esppow = int(espresso_Required_Containers)
sugar = int(sugar_Required_Containers)
flour= int(flour_Required_Containers)
chip= int(chip_Required_Containers)
butter= int(butter_Required_Containers)
vanilla= int(vanilla_Required_Containers)
egg = int(egg_Required_Containers)


copowPrice = copow * 1.99 #These lines will get you the price
saltPrice = salt * 0.49
bakpowPrice = bakpow * 1.89
esppowPrice = esppow * 5.39
sugarPrice = sugar* 1.99
flourPrice = flour * 1.99
chipPrice = chip* 1.99
butterPrice = butter * 2.99
vanillaPrice = vanilla* 10.59
eggPrice = egg * 1.99

totalPrice = copowPrice + saltPrice + bakpowPrice + esppowPrice + sugarPrice + flourPrice + chipPrice + butterPrice + vanillaPrice + eggPrice 
totalPrice = format(totalPrice,'0,.2f')
print("\nTo serve", costumerNum, "make", batchNum, "batches") #These lines of code align 
print("-"*30,"\n\tGrocery List\n","-"*30, sep='')
print(format("Cocoa", "19s"), copow)
print(format("\nSalt", "20s"), salt)
print(format("\nBaking Powder",'20s'),bakpow)
print(format("\nEspresso Powder",'20s'), esppow)
print(format("\nSugar",'20s'), sugar)
print(format("\nFlour",'20s'), flour)
print(format("\nChocolate Chips",'20s'), chip)
print(format("\nVanilla", '20s'), vanilla)
print(format("\nEggs", '20s'), egg)
print(format("\nButter", '20s'), butter)
print(format("\n\nTotal price $",'20s'), totalPrice)

#Testing:
#Things that I did to test were, compare outputs of 100 and 96 people with my classmates. If they were the same, I felt confident.
#One time I had the wrong amount of vanilla because I used a direct conversion factor I found on the internet instead of the ones given.
#Another time, I thought because butter and eggs didn't need any unit conversions that meant they didn't need any conversions at all so I forgot 18!  
#and converted the "2D" math of my unit conversations to "1D" math that I wrote in the code.
#I found this method helped me best keep track of my units.
#Summary:
#I learned how to use the format function and format function specifiers, 
#Next time I think of better variable names earlier so I don't feel like changing them midway through.
#A place where I got stuck was unit conversations because I'm so used to converting units in "2D" it felt jaring to turn them into "1D" math.
 #I got stuck at calculation part am not that much good at it o it was alittle bot challenging 
#I wish I made it so when the number's digits increased, they move the right instead of the left.
#Thank you 


# TabLayout_with_bottom_Navigations


## App design
![](https://github.com/ayush19283/TabLayout_with_bottom_Navigations/blob/main/app/WhatsApp%20Image%202023-07-12%20at%2012.22.42.jpeg)


## The flow of the app is as follows
1. In ActivityMain file create Bottom Nav tags and in MainActivity java file Define the No of Fragments you want to create.
2. In this app there are three Bottom Nav bars , so I have create 3 Fragements name - BlankFragment, BlankFragment2, BlankFragment3.
3. Also you need to define a Menu Resource file for giving name and icons to the bottom nav bar.
4. Then I have added the Tablayout in the first Bottom Nav , so inflate the tab layout in the oncreate of BlangFragment.
5. Any no of Tabs can be added in the Tab layout , you have to create the fragment for each Tab and an Adapter java file to combine those tabs.
6. Remember that we need to create fragments both for Bottom Navigation Bars as well as Tab layouts . Anything you wish to display
will be shown in fragments

## Essence of this design 
    This layout is used when you want to display the large amount of data in a very ordered way. Also you may redraft the design of Tablayout and Bottom Navigations as per your choice
    
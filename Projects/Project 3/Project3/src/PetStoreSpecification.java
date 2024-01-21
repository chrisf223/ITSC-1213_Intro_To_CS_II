/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

import java.util.ArrayList;

/**
 *
 * @author chrisf
 */
/* the PetStoreSpecification interface displays all of the pets for adoption and returns the total value of the inventory
*/
public interface PetStoreSpecification {
    /** displays all of the pets available for adoption
     * @param dogList
     * @param catList
     * @param exoticPetList
     */
    public void adoptionDrive(ArrayList<Dog> dogList,ArrayList<Cat> catList,ArrayList<ExoticPet> exoticPetList); 
    /** returns the total value of all the pets currently in the inventory
     * @return 
     */
    public double inventoryValue(); 
}

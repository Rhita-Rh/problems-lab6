package challenge;

public class Item
{
    private String name;
    
    // -------------------------------------------------------

// -------------------------------------------------------
    public Item (String itemName)
    {
        name = itemName;
    }
    // -------------------------------------------------------
// Return a string with the information about the item
// -------------------------------------------------------
    public String toString ()
    {
        return (name + "\t");
    }

    // -------------------------------------------------
// Returns the name of the item
// -------------------------------------------------
    public String getName()
    {
        return name;
    }

}
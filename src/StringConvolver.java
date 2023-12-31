/**
 * String Convolver
 */
public class StringConvolver
{
    private String sourceString, find1, replace1;

    public void setSourceString(String sourceString)
    {
        this.sourceString = sourceString;
    }

    public void setFind1(String find1)
    {
        this.find1 = find1;
    }

    public void setReplace1(String replace1)
    {
        this.replace1 = replace1;
    }

    /**
     * replaces all occurrences of the "find1" string found in "sourceString" with "replace1" string. Do this N times.
     * NOTE #1: find1, sourceString, and replace1 are all class variables.
     * NOTE #2: if find1 is an empty string, return the source string.
     *
     * There are several "levels" of complexity that you might apply here:
     * Level 0: one character --> one character
     * For example, if sourceString is "bottom", find1 is "o" and replace1 is "i", then
     * convolveStringNTimes(0) --> "bottom"
     * convolveStringNTimes(1) --> "bittim"
     *
     * Level 1: one character --> multi characters
     * If sourceString is "I was washing my watermelon", find1 is "w" and replace1 is "two", then
     * convolveStringNTimes(0) --> "I was washing my watermelon"
     * convolveStringNTimes(1) --> "I twoas twoashing my twoatermelon"
     * convolveStringNTimes(2) --> "I ttwooas ttwooashing my ttwooatermelon"
     *
     * Level 2: multi character --> multi characters
     * If sourceString is "plant", find1 is "an" and replace1 is "handyman"
     * convolveStringNTimes(1) --> "plhandymant"
     * convolveStringNTimes(2) --> "plhhandymandymhandymant"
     * convolveStringNTimes(3) --> "plhhhandymandymhandymandymhhandymandymhandymant"
     * Clarification: Once you have found a match you should continue search _after_ the found section of the source
     * string, not within the selection.
     * If sourceString is "aaaa", find1 is "aa" and replace1 is "b"
     * convolveStringNTimes(1) --> "bb" Note: NOT "bbb".
     * (Although there is an "aa" at positions 1&2, after the first "aa" at position 0&1 is found, the search continues
     * starting at position 2.)
     *
     * Level 3: multiple replace-with pairs
     * Note: this will require creating new variables and modifiers in this class and new GUI elements in the frame.
     * Don't do find1/replace1 if find1 is "". Don't do find2/replace2 if find2 is "".
     * If sourceString is "happy", find1 is "ha" and replace1 is "sna", and find2 is "py" and replace2 is "per"
     * convolveStringNTimes(0) --> "happy"
     * convolveStringNTimes(1) --> "snapper"
     *
     * @param N - the number of times you should loop through this string doing a replacement pass
     * @return - a string generated from the source string with the find-replace cycle completed N times.
     */
    public String convolveStringNTimes(int N)
    {
        // since you can't change string variables, this is a similar object that is more efficient.
        StringBuilder builder = new StringBuilder(sourceString);

        int find1Length = find1.length();
        for (int i=0; i<N; i++) // do N cycles.
        {

            String tempSource = builder.toString();
            int tempSourceLength = tempSource.length();
            builder = new StringBuilder();  // you'll use bulder.append(___) to add strings or chars to this string.
            // --------------------------------------------------------------------------------------------------------
            // TODO #1: loop through tempSource string and at each point, identify whether you have a match for find1.
            //          If so, add replace to the builder; if not, add the character in tempSource at this location.

            // --------------------------------------------------------------------------------------------------------

        }

        return builder.toString();
    }



}

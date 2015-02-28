/**Course:          SDEV 350 ~ Java Programming II
 * Author Name:     Bobby Erwin<bobby@bobanahalf.com>
 * Assignment Name: berwin_week7
 * Date:            Feb 28, 2015
 * Description:     Custom JTextField, limited to specified size
 *
 * ------------------------------------------------------------ *
 * Change log
 * User     Date        Description
 * -------- ----------  --------------------------------------- *
 *
 * ------------------------------------------------------------ *
 */

package berwin_week7;

//Imports
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;

//Begin Class JTextFieldLimit
public class JTextFieldLimit extends PlainDocument {

    private int limit;
    
    public JTextFieldLimit(int limit) {
        super();
        setLimit(limit);
    }
    
//    @Override
//    protected Document createDefaultModel() {
//        return new LimitDocument();
//    }

//    private class LimitDocument {
//        @Override
    public void insertString( int offset, String  str, AttributeSet attr ) {
        try {
            if (str == null) return;
            if ((getLength() + str.length()) <= limit) {
                super.insertString(offset, str, attr);
            }
        } catch (BadLocationException ex) {
            // silent
        }
    }
//    }
    
    private void setLimit(int limit) {
        this.limit = limit;
    }
} //End Class JTextFieldLimit
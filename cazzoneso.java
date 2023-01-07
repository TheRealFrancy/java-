import javax.swing.JOptionPane;
        public class Main {
            public static void main(String[] args) {

                String scelta;
                int contofrancesco = 0;
                String[] options = {"aggiungi", "rimuovi", "cancella"};
                int action;
                boolean continuare = true;
                boolean continuaredue = true;
                JOptionPane.showMessageDialog(null, "Ciao benvnut* nel cringe bank system\n digita a per visualizzare il tuo saldo\n digita b per aggiungere o rimuovere soldi dal tuo conto");

                while (continuaredue) {
                    scelta = JOptionPane.showInputDialog("Scegli l'opzione");
                    if (scelta.equals("a")) {
                        JOptionPane.showMessageDialog(null, "il conto e di" + contofrancesco);

                    } // end if a


                    if (scelta.equals("b")) {
                        while (continuare) {
                            action = JOptionPane.showOptionDialog(null, "finestra di modifica soldi", "il tuo saldo e di:" + contofrancesco, JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

                            if (action == JOptionPane.YES_OPTION) {
                                contofrancesco = contofrancesco + 100;


                            } else if (action == JOptionPane.NO_OPTION) {
                                contofrancesco = contofrancesco - 100;

                            } else if (action == JOptionPane.CANCEL_OPTION) {
                                continuare = false;
                                //JOptionPane.showMessageDialog(null, "il conto e di" + contofrancesco);


                            }

                        }


                    } // end if b
                 continuare=true;
                }

            }// end main
        } //end class

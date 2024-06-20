package com.mycompany.views;

import com.mycompany.ilib.DAOBooksImpl;
import com.mycompany.interfaces.DAOBooks;
import com.mycompany.utils.Utils;
import java.awt.Color;

public class UpBooks extends javax.swing.JPanel {

    boolean isEdition = false;
    com.mycompany.models.Books bookEdition;

    public UpBooks() {
        initComponents();
        InitStyles();
    }

    public UpBooks(com.mycompany.models.Books book) {
        initComponents();
        isEdition = true;
        bookEdition = book;
        InitStyles();
    }

    private void InitStyles() {
        title.putClientProperty("FlatLaf.styleClass", "h1");
        title.setForeground(Color.black);
        titleTxt.putClientProperty("JTextField.placeholderText", "Insira o título do livro");
        dateTxt.putClientProperty("JTextField.placeholderText", "Insira o ano de publicação do Livro.");
        authorTxt.putClientProperty("JTextField.placeholderText", "Insira o nome do autor.");
        catTxt.putClientProperty("JTextField.placeholderText", "Insira a categoria do livro.");
        edTxt.putClientProperty("JTextField.placeholderText", "Insira o editoral do livro.");
        langTxt.putClientProperty("JTextField.placeholderText", "Insira o idioma do livro.");
        pagsTxt.putClientProperty("JTextField.placeholderText", "Insira o total de páginas de livros.");
        descTxt.putClientProperty("JTextField.placeholderText", "Insira a descrição do livro.");
        stockTxt.putClientProperty("JTextField.placeholderText", "Insira o total de estoque do livro.");
        dispTxt.putClientProperty("JTextField.placeholderText", "Insira o número de livros em estoque.");
        ejemTxt.putClientProperty("JTextField.placeholderText", "Insira o total de exemplares do livro.");

        if (isEdition) {
            title.setText("Editar Livro");
            button.setText("Guardar");

            if (bookEdition != null) {
                titleTxt.setText(bookEdition.getTitle());
                dateTxt.setText(bookEdition.getDate());
                authorTxt.setText(bookEdition.getAuthor());
                catTxt.setText(bookEdition.getCategory());
                edTxt.setText(bookEdition.getEdit());
                langTxt.setText(bookEdition.getLang());
                pagsTxt.setText(bookEdition.getPages());
                descTxt.setText(bookEdition.getDescription());
                stockTxt.setText(bookEdition.getStock() + "");
                dispTxt.setText(bookEdition.getAvailable() + "");
                ejemTxt.setText(bookEdition.getEjemplares());
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        titleTxt = new javax.swing.JTextField();
        dateLbl = new javax.swing.JLabel();
        dateTxt = new javax.swing.JTextField();
        authorLbl = new javax.swing.JLabel();
        authorTxt = new javax.swing.JTextField();
        catLbl = new javax.swing.JLabel();
        catTxt = new javax.swing.JTextField();
        edLbl = new javax.swing.JLabel();
        edTxt = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        langLbl = new javax.swing.JLabel();
        langTxt = new javax.swing.JTextField();
        pagsLbl = new javax.swing.JLabel();
        pagsTxt = new javax.swing.JTextField();
        descLbl = new javax.swing.JLabel();
        descTxt = new javax.swing.JTextField();
        stockLbl = new javax.swing.JLabel();
        stockTxt = new javax.swing.JTextField();
        dispTxt = new javax.swing.JTextField();
        dispLbl = new javax.swing.JLabel();
        ejemLbl = new javax.swing.JLabel();
        ejemTxt = new javax.swing.JTextField();
        button = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        title.setText("Registrar Livro");

        titleLbl.setText("Título");

        dateLbl.setText("Data de publicação");

        authorLbl.setText("Autor");

        catLbl.setText("Categoria");

        edLbl.setText("Edição");

        jSeparator1.setForeground(new java.awt.Color(204, 204, 204));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));

        langLbl.setText("Idioma");

        langTxt.setToolTipText("");

        pagsLbl.setText("Páginas");

        pagsTxt.setToolTipText("");

        descLbl.setText("Descrição");

        descTxt.setToolTipText("");

        stockLbl.setText("Stock");
        stockLbl.setToolTipText("");

        stockTxt.setToolTipText("");

        dispTxt.setToolTipText("");

        dispLbl.setText("Disponíveis");

        ejemLbl.setText("Exemplares");

        ejemTxt.setToolTipText("");

        button.setBackground(new java.awt.Color(18, 90, 173));
        button.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        button.setForeground(new java.awt.Color(255, 255, 255));
        button.setText("Registrar");
        button.setBorderPainted(false);
        button.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(catTxt)
                            .addComponent(authorTxt)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(authorLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(233, 233, 233))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(catLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(213, 213, 213))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(234, 234, 234))
                            .addComponent(titleTxt)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(dateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(161, 161, 161))
                            .addComponent(dateTxt)
                            .addComponent(edTxt, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(edLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(227, 227, 227)))
                        .addGap(68, 68, 68)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(langTxt)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(langLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(228, 228, 228))
                            .addComponent(pagsTxt)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(pagsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(223, 223, 223))
                            .addComponent(button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(descLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(206, 206, 206))
                            .addComponent(descTxt)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(stockTxt)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(stockLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(94, 94, 94)))
                                .addGap(20, 20, 20)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(dispLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(67, 67, 67))
                                    .addComponent(dispTxt)))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(ejemLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(208, 208, 208))
                            .addComponent(ejemTxt))
                        .addGap(72, 72, 72))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(553, 553, 553))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(langLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(langTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pagsLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pagsTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stockLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dispLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(stockTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dispTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(ejemLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ejemTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(titleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(titleTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dateTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(authorLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(authorTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11)
                        .addComponent(catLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(catTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(edTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        String mtitle = titleTxt.getText();
        String date = dateTxt.getText();
        String author = authorTxt.getText();
        String cat = catTxt.getText();
        String ed = edTxt.getText();
        String lang = langTxt.getText();
        String pags = pagsTxt.getText();
        String desc = descTxt.getText();
        String stock = stockTxt.getText();
        String disp = dispTxt.getText();
        String ejem = ejemTxt.getText();

        // Validaciones para los campos
        if (mtitle.isEmpty() || date.isEmpty() || author.isEmpty() || cat.isEmpty() || ed.isEmpty()
                || lang.isEmpty() || pags.isEmpty() || desc.isEmpty() || stock.isEmpty() || disp.isEmpty() || ejem.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "Deve preecnher tudo. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            titleTxt.requestFocus();
            return;
        } else if (!Utils.isNumeric(stock) || !Utils.isNumeric(disp)) {
            javax.swing.JOptionPane.showMessageDialog(this, "Campos de estoque ou outra coisa errada. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            titleTxt.requestFocus();
            return;
        }

        com.mycompany.models.Books book = isEdition ? bookEdition : new com.mycompany.models.Books();
        book.setTitle(mtitle);
        book.setDate(date);
        book.setAuthor(author);
        book.setCategory(cat);
        book.setEdit(ed);
        book.setLang(lang);
        book.setPages(pags);
        book.setDescription(desc);
        book.setEjemplares(ejem);
        book.setStock(Integer.parseInt(stock));
        book.setAvailable(Integer.parseInt(disp));

        try {
            DAOBooks dao = new DAOBooksImpl();

            if (!isEdition) {
                dao.registrar(book);
            } else {
                dao.modificar(book);
            }

            String successMsg = isEdition ? "modificado" : "registrado";

            javax.swing.JOptionPane.showMessageDialog(this, "Livro " + successMsg + " Existente.\n", "AVISO", javax.swing.JOptionPane.INFORMATION_MESSAGE);

            if (!isEdition) {
                titleTxt.setText("");
                dateTxt.setText("");
                authorTxt.setText("");
                catTxt.setText("");
                edTxt.setText("");
                langTxt.setText("");
                pagsTxt.setText("");
                descTxt.setText("");
                stockTxt.setText("");
                dispTxt.setText("");
                ejemTxt.setText("");
            }
        } catch (Exception e) {
            String errorMsg = isEdition ? "modificar" : "registrar";
            javax.swing.JOptionPane.showMessageDialog(this, "Ocorreu um erro com " + errorMsg + " esse livro. \n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_buttonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel authorLbl;
    private javax.swing.JTextField authorTxt;
    private javax.swing.JPanel bg;
    private javax.swing.JButton button;
    private javax.swing.JLabel catLbl;
    private javax.swing.JTextField catTxt;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JTextField dateTxt;
    private javax.swing.JLabel descLbl;
    private javax.swing.JTextField descTxt;
    private javax.swing.JLabel dispLbl;
    private javax.swing.JTextField dispTxt;
    private javax.swing.JLabel edLbl;
    private javax.swing.JTextField edTxt;
    private javax.swing.JLabel ejemLbl;
    private javax.swing.JTextField ejemTxt;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel langLbl;
    private javax.swing.JTextField langTxt;
    private javax.swing.JLabel pagsLbl;
    private javax.swing.JTextField pagsTxt;
    private javax.swing.JLabel stockLbl;
    private javax.swing.JTextField stockTxt;
    private javax.swing.JLabel title;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JTextField titleTxt;
    // End of variables declaration//GEN-END:variables
}
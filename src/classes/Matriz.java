package classes;

public class Matriz {
    private int quantidadeDeLinhas = 0;
    private int quantidadeDeColunas = 0;
    private int array[][] = null;
    
    public Matriz(int quantidadeDeLinhas, int quantidadeDeColunas) throws Exception {
        if (quantidadeDeLinhas <= 0 || quantidadeDeColunas <= 0) {
            throw new Exception("Quantidade de linhas e/ou colunas não pode ser <= 0");
        }
        this.quantidadeDeLinhas = quantidadeDeLinhas;
        this.quantidadeDeColunas = quantidadeDeColunas;
        array = new int[quantidadeDeLinhas][quantidadeDeColunas];
    }

    public int getQuantidadeDeLinhas() {
        return quantidadeDeLinhas;
    }

    public int getQuantidadeDeColunas() {
        return quantidadeDeColunas;
    }
    
    public void setElemento(int linha, int coluna, int elemento) throws Exception {
        if (linha < 0 || coluna < 0 || linha >= quantidadeDeLinhas || coluna >= quantidadeDeColunas) {
            throw new Exception("Linha e/ou coluna fora do intervalo válido");
        }
        array[linha][coluna] = elemento;
    }
    
    public int getElemento(int linha, int coluna) throws Exception {
        if (linha < 0 || coluna < 0 || linha >= quantidadeDeLinhas || coluna >= quantidadeDeColunas) {
            throw new Exception("Linha e/ou coluna fora do intervalo válido");
        }
        return array[linha][coluna];
    }
    
    public String getMatriz() {
        String str = "";
        for (int i = 0; i < quantidadeDeLinhas; i++) {
            for (int j = 0; j < quantidadeDeColunas; j++) {
                str += array[i][j] + " ";
            }
            str += "\n";
        }
        return str;
    }
    
    public Matriz soma(Matriz objeto) throws Exception {
        if (quantidadeDeLinhas != objeto.quantidadeDeLinhas || quantidadeDeColunas != objeto.quantidadeDeColunas) {
            throw new Exception("Só é possível somar/subtrair matrizes de mesma ordem");
        }
        Matriz aux = new Matriz(quantidadeDeLinhas, quantidadeDeColunas);
        for (int i = 0; i < aux.quantidadeDeLinhas; i++) {
            for (int j = 0; j < aux.quantidadeDeColunas; j++) {
                aux.setElemento(i, j, getElemento(i, j) + objeto.getElemento(i, j));
            }
        }
        return  aux;
    }
    
    public boolean isInt(String valor) {
        try {
            int numero = Integer.parseInt(valor);
            return true;
        }
        catch(NumberFormatException e) {
            return false;
        }
    }
    
    public Matriz prodEscalar(String valor) throws Exception {
        if (!isInt(valor)) {
            throw new Exception("O escalar digitado é inválido");
        }
        int valorInt = Integer.parseInt(valor);
        Matriz aux = new Matriz(quantidadeDeLinhas, quantidadeDeColunas);
        for (int i = 0; i < aux.quantidadeDeLinhas; i++) {
            for (int j = 0; j < aux.quantidadeDeColunas; j++) {
                aux.setElemento(i, j, valorInt * this.getElemento(i, j));
            }
        }
        return aux;
    }
    
    public Matriz subtrai(Matriz objeto) throws Exception {
        return soma(objeto.prodEscalar("-1"));
    }
    
    public Matriz transposta() throws Exception {
        Matriz aux = new Matriz(quantidadeDeColunas, quantidadeDeLinhas);
        for (int i = 0; i < aux.quantidadeDeLinhas; i++) {
            for (int j = 0; j < aux.quantidadeDeColunas; j++) {
                aux.setElemento(i, j, getElemento(j, i));
            }
        }
        return aux;
    }
    
    public boolean isIdent() throws Exception {
        if (quantidadeDeLinhas != quantidadeDeColunas) {
            throw new Exception("Matriz identidade precisa ser de ordem n");
        }
        for (int i = 0; i < quantidadeDeLinhas; i++) {
            for (int j = 0; j < quantidadeDeColunas; j++) {
                if (i == j && getElemento(i, j) != 1) {
                    return false;
                }
                if (i != j && getElemento(i, j) != 0) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean isSimet() throws Exception {
        return transposta().getMatriz().equals(getMatriz());
    }
    
    public boolean isEqual(Matriz objeto) throws Exception {
        if (quantidadeDeLinhas != objeto.quantidadeDeLinhas || quantidadeDeColunas != objeto.quantidadeDeColunas) {
            throw new Exception("Matrizes de dimensões diferentes são obrigatoriamente diferentes");
        }
        return getMatriz().equals(objeto.getMatriz());
    }
    
    public Matriz prodMatriz(Matriz objeto) throws Exception {
        if (quantidadeDeColunas != objeto.quantidadeDeLinhas) {
            throw new Exception("Não é possível realizar o produto entre essas matrizes");
        }
        Matriz aux = new Matriz(quantidadeDeLinhas, objeto.quantidadeDeColunas);
        for (int i = 0; i < quantidadeDeLinhas; i++) {
            for (int j = 0; j < objeto.quantidadeDeColunas; j++) {
                for (int k = 0; k < quantidadeDeColunas; k++) {
                    aux.setElemento(i, j, aux.getElemento(i, j) + getElemento(i, k) * objeto.getElemento(k, j));
                }
            }
        }
        return aux;
    }
    
    public boolean isOrtog() throws Exception {
        return prodMatriz(transposta()).isIdent();
    }
    
    public boolean isPermut() throws Exception {
        return prodMatriz(transposta()).getMatriz().equals(transposta().prodMatriz(this).getMatriz()) && isOrtog();
    }
    
    public void apaga() throws NullPointerException {
        if (this.array == null) {
            throw new NullPointerException("Não há o que apagar nesta matriz");
        }
        this.array = null;
    }
}

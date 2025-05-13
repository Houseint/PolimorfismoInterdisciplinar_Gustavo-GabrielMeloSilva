public class defCart extends Cartografia {
    @Override
    public void defCart(){
        System.out.println("A cartografia é a ciência de representar graficamente a superfície terrestre por meio de mapas e outras formas de visualização. Ela envolve a coleta e análise de dados espaciais para criar representações precisas do mundo. Suas aplicações vão do planejamento urbano à navegação e ao geoprocessamento.");
    }
    public float escala(){
        return getDistanciaMapa()/getTerreno();
    }
}
package fuente;
/**
 * 
 * This class is listener of a treeWalker of input that generates an input
 * symbol table
 * 
 * @author Alvarohf
 *
 */

public class ListenerInput extends GrammarInputParserBaseListener {

    private InputTable _tsimb;

    private ListenerInput() {
        super();
    }

    public ListenerInput(InputTable p_tsimb) {
        this._tsimb = p_tsimb;
    }

    @Override
    public void exitFile(GrammarInputParser.FileContext ctx) {
        //We check the type of value with our parser rules
        
        if (ctx.csvid() != null) {
            _tsimb.addCsv(ctx.path().getText());
        } else if (ctx.dotid() != null) {
            //After this we replace extensions to get the name
            _tsimb.addDot(ctx.path().getText().replace(".dot",""));
        } else if (ctx.jsonid() != null) {
            _tsimb.addJson(ctx.path().getText());
        } else if (ctx.svgid() != null) {
            _tsimb.addSvg(ctx.path().getText().replace(".svg",""));
        }
    }

    @Override
    public void exitFontsize(GrammarInputParser.FontsizeContext ctx) {
        //First we check if our grammar could get the value for the parameter if we cant we dont add it
        if (!ctx.numberValue().getText().contains("missing")){
            //We set as key of our hashMap the position of parameter and we add the attribute with its value
            _tsimb.addCustom(ctx.field().getText()+ctx.params().getText().replace("=",""), "fontsize="+ctx.numberValue().getText());
        }
    }

    @Override
    public void exitLen(GrammarInputParser.LenContext ctx) {
           //First we check if our grammar could get the value for the parameter if we cant we dont add it
        if (!ctx.numberValue().getText().contains("missing")){
            //We set as key of our hashMap the position of parameter and we add the attribute with its value
            _tsimb.addCustom(ctx.params().getText().replace("=",""), "len="+ctx.numberValue().getText());
        }
    }

    @Override
    public void exitFontcolor(GrammarInputParser.FontcolorContext ctx) {
         //First we check if our grammar could get the value for the parameter if we cant we dont add it
        if (!ctx.string().getText().contains("missing")&&!(ctx.string().getText().equals(""))){
            //We set as key of our hashMap the position of parameter and we add the attribute with its value
            _tsimb.addCustom(ctx.field().getText()+ctx.params().getText().replace("=",""), "fontcolor="+"\""+ctx.string().getText()+"\"");
        }
    }

    @Override
    public void exitFontname(GrammarInputParser.FontnameContext ctx) {
         //First we check if our grammar could get the value for the parameter if we cant we dont add it
        if (!ctx.string().getText().contains("missing")&&!(ctx.string().getText().equals(""))){
            //We set as key of our hashMap the position of parameter and we add the attribute with its value
            _tsimb.addCustom(ctx.field().getText()+ctx.params().getText().replace("=",""), "fontname="+"\""+ctx.string().getText()+"\"");
        }
    }

    @Override
    public void exitArrowsize(GrammarInputParser.ArrowsizeContext ctx) {
         //First we check if our grammar could get the value for the parameter if we cant we dont add it
        if (!ctx.numberValue().getText().contains("missing")){
            //We set as key of our hashMap the position of parameter and we add the attribute with its value
            _tsimb.addCustom(ctx.field().getText()+ctx.params().getText().replace("=",""), "arrowsize="+ctx.numberValue().getText());
        }
    }

    @Override
    public void exitArrowcolor(GrammarInputParser.ArrowcolorContext ctx) {
         //First we check if our grammar could get the value for the parameter if we cant we dont add it
        if (!ctx.string().getText().contains("missing")&&!(ctx.string().getText().equals(""))){
            //We set as key of our hashMap the position of parameter and we add the attribute with its value
            _tsimb.addCustom(ctx.field().getText()+ctx.params().getText().replace("=",""), "color="+"\""+ctx.string().getText()+"\"");
        }
    }

    @Override
    public void exitPenwd(GrammarInputParser.PenwdContext ctx) {
        //First we check if our grammar could get the value for the parameter if we cant we dont add it
        if (!ctx.numberValue().getText().contains("missing")){
            //We set as key of our hashMap the position of parameter and we add the attribute with its value
            _tsimb.addCustom(ctx.field().getText()+ctx.params().getText().replace("=",""), "penwidth="+ctx.numberValue().getText());
        }
    }

    @Override
    public void exitFillcolor(GrammarInputParser.FillcolorContext ctx) {
        //First we check if our grammar could get the value for the parameter if we cant we dont add it
        if (!ctx.string().getText().contains("missing")&&!(ctx.string().getText().equals(""))){
            //We set as key of our hashMap the position of parameter and we add the attribute with its value
            _tsimb.addCustom(ctx.field().getText()+ctx.params().getText().replace("=",""), "fillcolor="+"\""+ctx.string().getText()+"\"");
        }
    }

    @Override
    public void exitShape(GrammarInputParser.ShapeContext ctx) {
        //First we check if our grammar could get the value for the parameter if we cant we dont add it
        if (!ctx.string().getText().contains("missing")&&!(ctx.string().getText().equals(""))){
            //We set as key of our hashMap the position of parameter and we add the attribute with its value
            _tsimb.addCustom(ctx.field().getText()+ctx.params().getText().replace("=",""), "shape="+"\""+ctx.string().getText()+"\"");
        }
    }

    @Override
    public void exitStyle(GrammarInputParser.StyleContext ctx) {
        //First we check if our grammar could get the value for the parameter if we cant we dont add it
        if (!ctx.string().getText().contains("missing")&&!(ctx.string().getText().equals(""))){
            //We set as key of our hashMap the position of parameter and we add the attribute with its value
            _tsimb.addCustom(ctx.field().getText()+ctx.params().getText().replace("=",""), "style="+"\""+ctx.string().getText()+"\"");
        }
    }

}
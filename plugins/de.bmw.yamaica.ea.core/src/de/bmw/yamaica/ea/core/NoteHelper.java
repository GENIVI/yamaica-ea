package de.bmw.yamaica.ea.core;

import org.franca.core.franca.FAnnotation;
import org.franca.core.franca.FAnnotationType;
import org.franca.core.franca.FModelElement;

public class NoteHelper
{
    public NoteHelper()
    {

    }

    public String getDescription(FModelElement src)
    {

        return getContentFromAnnotation(src, FAnnotationType.DESCRIPTION);

    }

    public String getAuthor(FModelElement src)
    {
        return getContentFromAnnotation(src, FAnnotationType.AUTHOR);
    }

    public String getContentFromAnnotation(FModelElement src, FAnnotationType annotationType)
    {
        if (src == null)
        {
            return "";
        }

        if (src.getComment() != null)
        {
            for (FAnnotation fa : src.getComment().getElements())
            {
                if (fa.getType().equals(annotationType))
                {
                    return fa.getComment().trim();
                }
            }
            return "";
        }

        else
        {
            return "";
        }
    }
}

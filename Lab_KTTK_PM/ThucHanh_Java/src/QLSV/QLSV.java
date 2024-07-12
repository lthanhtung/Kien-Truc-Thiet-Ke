package QLSV;

import java.util.ArrayList;
import java.util.List;

public class QLSV  {
    ISoSanh soSanh;
    List<SinhVien> list = new ArrayList<>();

    public QLSV setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
        return this;
    }

    public void them(SinhVien sv)
    {
        list.add(sv);
    }
    public  void XapSep()
    {
        for (int i = 0;i<list.size()-1;i++)
        {
            for (int j = i+1;j<list.size();j++)
            {
                if (soSanh.SoSanh(list.get(i),list.get(j)) > 0)
                {
                    SinhVien s = list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,s);
                }

            }
        }
    }
    public void inDS()
    {
        for (SinhVien s:list)
        {
            System.out.println(s.toString());
        }
    }
}


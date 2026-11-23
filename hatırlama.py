print("hoşgeldiniz")
print("bugünün menüsünde kuzu tandır lahmacun kelle paça var")
print("kuzu tandır için 1")
print("lahamacun için 2")
print("kelle paça için 3'e basınız")

seçim = int(input("ne yemek istersiniz: "))

if seçim == 1:
    print("kuzu tandır geliyor")
elif seçim == 2:
    print("lahmacun geliyor")
elif seçim == 3:
    print("kelle paça geliyor")
else:
    print("dışarı çık kardeş")

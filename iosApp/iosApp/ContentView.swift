import SwiftUI
import shared

struct ContentView: View {
    
    @State private var dividend: String = "0"
    @State private var divisor: String = "0"
    @State private var result: String = "Result: "

    
    var body: some View {
        VStack(alignment: .leading) {
            HStack(alignment: .top) {
                Text("Divide")
                TextField("", text: $dividend).keyboardType(.numberPad)
                Text(":")
                TextField("", text: $divisor).keyboardType(.numberPad)
            }
            Button(action: {
                self.result = "Result: \(Calculator().divide(dividend: (self.dividend as NSString).floatValue, divisor: (self.divisor as NSString).floatValue))"
            }) {
                Text("Calculate")
            }
            Text(result)
            Spacer()
        }.padding()
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
